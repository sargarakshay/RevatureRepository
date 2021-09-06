package com.app.dao.impl;

import com.app.dao.CustomerDAO;
import com.app.dbutil.MySQLDBConnection;
import com.app.exception.BusinessException;
import com.app.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean isValidCustomerLoginCredentials(Customer customer) throws BusinessException {
       try(Connection connection = MySQLDBConnection.getConnection()) {
           String sql = "SELECT customerUsername FROM customerlogin WHERE customerUsername = ? AND customerPassword = ?";
           PreparedStatement preparedStatement = connection.prepareStatement(sql);
           preparedStatement.setString(1, customer.getCustomerUsername());
           preparedStatement.setString(2, customer.getCustomerPassword());

           ResultSet resultSet = preparedStatement.executeQuery();
           if (resultSet.next()) {
               return true;
           } else {
               throw new BusinessException("Invalid login credentials, please try again!");
           }
       } catch (ClassNotFoundException | SQLException e) {
           throw new BusinessException(e.getMessage());
       }
    }
}
