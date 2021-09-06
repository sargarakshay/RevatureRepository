package com.app.controller;

import com.app.exception.BusinessException;
import com.app.model.Customer;
import com.app.service.CustomerService;
import com.app.service.impl.CustomerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String username = req.getParameter("customerUsername");
        String password = req.getParameter("customerPassword");

        Customer customer = new Customer();
        customer.setCustomerUsername(username);
        customer.setCustomerPassword(password);

        CustomerService customerService = new CustomerServiceImpl();
        RequestDispatcher requestDispatcher;
        try {
            if(customerService.isValidCustomerLoginCredentials(customer)) {
                requestDispatcher = req.getRequestDispatcher("success");
                requestDispatcher.forward(req, resp);
            }
        } catch (BusinessException e) {
            requestDispatcher = req.getRequestDispatcher("login.html");
            requestDispatcher.include(req, resp);
            out.print("<span style='color: #fff;'>"+e.getMessage()+"</span>");
        }
    }
}
