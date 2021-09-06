package com.app.controller;

import com.app.model.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "StudentDetailsController", value = "/student-details")
public class StudentDetailsController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");

        HttpSession httpSession = request.getSession();
        Student student = new Student();
        student.setStudentId(Integer.parseInt(request.getParameter("studentId")));
        student.setStudentName(request.getParameter("studentName"));
        student.setStudentContact(Long.parseLong(request.getParameter("studentContact")));

        httpSession.setAttribute("student", student);
        response.sendRedirect("education-details.html");
    }
}
