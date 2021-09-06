package com.app.controller;

import com.app.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CertificateDetailsController", value = "/certificate-details")
public class CertificateDetailsController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession httpSession = request.getSession(false);
        if (httpSession!=null) {
            Student student = (Student) httpSession.getAttribute("student");
            student.setCertificateName(request.getParameter("certificateName"));
            student.setCertificateValidity(Integer.parseInt(request.getParameter("certificateValidity")));
            httpSession.setAttribute("student", student);
            response.sendRedirect("summery-details.html");
        } else {
            RequestDispatcher requestDispatcher;
            requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
            PrintWriter printWriter = response.getWriter();
            printWriter.print("<h1>Please fill out the student details first</h1>");
        }
    }
}
