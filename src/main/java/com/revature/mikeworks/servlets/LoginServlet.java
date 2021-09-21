package com.revature.mikeworks.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.mikeworks.enums.ERSUserRoles;
import com.revature.mikeworks.models.ERSUser;
import com.revature.mikeworks.models.PHash;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;

public class LoginServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException {
        res.setContentType("text/html");
        ObjectMapper om = new ObjectMapper();

        try {
            PrintWriter out = res.getWriter();
            PHash temp = new PHash();
            temp.setPassword("12345");
            ERSUser user = new ERSUser(0L, "user1", temp,
                    "Bob", "Test", "test@test.com",
                    ERSUserRoles.EMPLOYEE);
            String jString = om.writeValueAsString(user);
            ERSUser user1 = om.readValue(jString, ERSUser.class);
            out.println("user");
            out.println(user1);
            out.println(jString);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
