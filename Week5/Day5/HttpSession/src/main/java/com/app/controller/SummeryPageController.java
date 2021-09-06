package com.app.controller;

import com.app.model.Student;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SummeryPageController", value = "/summery-page")
public class SummeryPageController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookieList = request.getCookies();
        PrintWriter printWriter = response.getWriter();

        HttpSession httpSession = request.getSession(false);
        RequestDispatcher requestDispatcher;
        if (httpSession!= null) {
            Student student = (Student) httpSession.getAttribute("student");
            requestDispatcher = request.getRequestDispatcher("summery-details.html");
            requestDispatcher.include(request, response);

            printWriter.println("<div class='container'>");
            printWriter.println("<h2 class='text-center'>Student Details</h2>");
            printWriter.println("<table class='table table-responsive'>");
            printWriter.println("<thead class='thead-light'>");
            printWriter.println("<tr>" +
                    "<th>#</th>" +
                    "<th>Name</th>" +
                    "<th>Contact</th>" +
                    "<th>University</th>" +
                    "<th>Year of Passing</th>" +
                    "<th>Certificate Name</th>" +
                    "<th>Certificate Validity</th>" +
                    "</tr>" +
                    "<tr>" +
                    "<td>"+student.getStudentId()+"</td>" +
                    "<td>"+student.getStudentName()+"</td>" +
                    "<td>"+student.getStudentContact()+"</td>" +
                    "<td>"+student.getUniversityName()+"</td>" +
                    "<td>"+student.getYearOfPassing()+"</td>" +
                    "<td>"+student.getCertificateName()+"</td>" +
                    "<td>"+student.getCertificateValidity()+"</td>" +
                    "</tr>");
            printWriter.println("</thead>");
            printWriter.println("</table>");
            printWriter.println("</div>");

            httpSession.invalidate();
        } else {
            requestDispatcher = request.getRequestDispatcher("index.html");
            requestDispatcher.include(request, response);
            printWriter.print("<h1>Please fill out the student details first</h1>");
        }
    }
}
