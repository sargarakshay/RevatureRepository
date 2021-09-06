package com.app.dao;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface CustomerDAO {
    public boolean isValidCustomerLoginCredentials(Customer customer) throws BusinessException;
}
