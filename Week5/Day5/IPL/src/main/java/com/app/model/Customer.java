package com.app.model;

public class Customer {
    private String customerUsername;
    private String customerPassword;

    public Customer() {
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerUsername='" + customerUsername + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                '}';
    }
}
