package com.app.controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SummeryPageController", value = "/summery-page")
public class SummeryPageController extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie[] cookieList = request.getCookies();
        PrintWriter printWriter = response.getWriter();

        RequestDispatcher requestDispatcher;
        requestDispatcher = request.getRequestDispatcher("summery-details.html");
        requestDispatcher.include(request, response);

        printWriter.println("<div class='container'>");
        printWriter.println("<h2 class='text-center'>Student Details</h2>");
        printWriter.println("<table class='table'>");
        for (Cookie cookie : cookieList) {
            printWriter.println("<thead class='thead-light'>");
            printWriter.println("<tr>");
            printWriter.println("<th>"+cookie.getName()+"</th>");
            printWriter.println("<td>"+cookie.getValue()+"</td>");
            printWriter.println("</tr>");
            printWriter.println("</thead>");
        }
        printWriter.println("</table>");
        printWriter.println("</div>");
    }
}
