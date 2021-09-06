package com.app.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CertificateDetailsController", value = "/certificate-details")
public class CertificateDetailsController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        Cookie cookie1 = new Cookie("certificateName", request.getParameter("certificateName"));
        Cookie cookie2 = new Cookie("certificateValidity", request.getParameter("certificateValidity"));

        response.addCookie(cookie1);
        response.addCookie(cookie2);

//        RequestDispatcher requestDispatcher;
//        requestDispatcher = request.getRequestDispatcher("/summery-page");
//        requestDispatcher.forward(request, response);
        response.sendRedirect("summery-details.html");
    }
}
