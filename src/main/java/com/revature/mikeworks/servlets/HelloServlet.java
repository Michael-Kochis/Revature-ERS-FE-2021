package com.revature.mikeworks.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

@WebServlet(urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        res.setContentType("text/html");

        try {
            PrintWriter out = res.getWriter();
            out.println("<p>");
            out.println("This is a p tag.");
            out.println("</p>");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
