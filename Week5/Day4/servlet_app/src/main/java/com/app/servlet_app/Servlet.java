package com.app.servlet_app;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;


public class Servlet extends HttpServlet {

    public Servlet() {
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletContext servletContext = getServletContext();
        ServletConfig servletConfig = getServletConfig();

        if(request.getParameter("username").equals("admin")) {
            out.println("<h1>Username is matched sucessfull</h1>");
            if(request.getParameter("password").equals("admin@123")) {
                out.println("<h1>Password is matched sucessfull</h1>");
                out.println("<h1>Login sucessfull</h1>");
                out.println("<h1> English : " + servletConfig.getInitParameter("english")+"</h1>");
                out.println("<h1> Marathi : " + servletConfig.getInitParameter("marathi")+"</h1>");
                out.println("<h1> Mid Sem CGPA : " + servletContext.getInitParameter("midsem")+"</h1>");
                out.println("<h1> End Sem CGPA : " + servletContext.getInitParameter("endsem")+"</h1>");
            } else {
                out.println("<h3>Password is not matched sucessfull</h3>");
            }
        } else {
            out.println("<h3>Username is not matched sucessfull</h3>");
        }
    }
}
