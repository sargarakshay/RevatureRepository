package com.app.service.impl;

import com.app.dao.CustomerDAO;
import com.app.dao.impl.CustomerDAOImpl;
import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    CustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public boolean isValidCustomerLoginCredentials(Customer customer) throws BusinessException {
        boolean isValid;
        if (customer.getCustomerUsername().matches("[a-z]\\w{6,20}") && customer.getCustomerPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$")) {
            isValid = customerDAO.isValidCustomerLoginCredentials(customer);
        } else {
            throw new BusinessException("Please enter valid username and password");
        }
        return isValid;
    }
}
