package com.app.servlet;

import com.app.PlayerData;
import com.app.model.Player;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletConfigDemo", value = "/ServletConfigDemo")
public class ServletConfigDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        ServletConfig config = getServletConfig();
        PlayerData playerData = new PlayerData();

        //Player details form servletConfig.
        out.println("<h1>Player Details Form Servlet Config</h1>");
        out.println("<p>  Name : " + config.getInitParameter("playerName") + "</p>");
        out.println("<p>  Age : " + config.getInitParameter("playerAge") + "</p>");
        out.println("<p>  City : " + config.getInitParameter("playerCity") + "</p> <br>");

        //Player details form client input form.
        out.println("<h1>Player Details Form Client Input</h1>");
        out.println("<p>  Name : " + request.getParameter("playerName") + "</p>");
        out.println("<p>  Age : " + request.getParameter("playerAge") + "</p>");
        out.println("<p>  City : " + request.getParameter("playerCity") + "</p>");


        //Passing servletConfig data to method getPlayerData();
        Player player = new Player();
        player.setName(request.getParameter("playerName"));
        player.setAge(Integer.parseInt(request.getParameter("playerAge")));
        player.setCity(request.getParameter("playerCity"));
        playerData.getPlayerData(player);

        //Passing client input data to method getPlayerData();
        Player player2 = new Player();
        player2.setName(config.getInitParameter("playerName"));
        player2.setAge(Integer.parseInt(config.getInitParameter("playerAge")));
        player2.setName(config.getInitParameter("playerCity"));
        playerData.getPlayerData(player2);
    }
}
