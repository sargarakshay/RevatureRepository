package com.app.service;

import com.app.exception.BusinessException;
import com.app.model.Customer;

public interface CustomerService {
    public boolean isValidCustomerLoginCredentials(Customer customer) throws BusinessException;
}
