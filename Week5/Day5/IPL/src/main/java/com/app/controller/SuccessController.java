package com.app.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;


public class SuccessController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();

        printWriter.println("<h1>Hello! "+request.getParameter("customerUsername")+"</h1>");
        printWriter.println("<h2>You logged on "+new Date()+"</h2>");
        printWriter.println("<button><a href='/ipl'>Submit</a></button>");
    }
}
