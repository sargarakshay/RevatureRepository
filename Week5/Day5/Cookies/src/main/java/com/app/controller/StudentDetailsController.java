package com.app.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "StudentDetailsController", value = "/student-details")
public class StudentDetailsController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Cookie cookie1 = new Cookie("StudentId", request.getParameter("studentId"));
        Cookie cookie2 = new Cookie("StudentName", request.getParameter("studentName"));
        Cookie cookie3 = new Cookie("StudentContact", request.getParameter("studentContact"));

        response.addCookie(cookie1);
        response.addCookie(cookie2);
        response.addCookie(cookie3);
        response.sendRedirect("education-details.html");
    }
}
