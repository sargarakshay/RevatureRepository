package com.app.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EducationDetailsController", value = "/education-details")
public class EducationDetailsController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        Cookie cookie4 = new Cookie("university" , request.getParameter("university"));
        Cookie cookie5 = new Cookie("yearOfPassing", request.getParameter("yearOfPassing"));

        response.addCookie(cookie4);
        response.addCookie(cookie5);
        response.sendRedirect("certificate-details.html");

    }
}
