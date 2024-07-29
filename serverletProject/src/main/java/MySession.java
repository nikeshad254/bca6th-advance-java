package main.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.util.Date;

public class MySession extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        HttpSession session = req.getSession();
        Date lastAccessed = (Date) session.getAttribute("lastAccessed");
        session.setAttribute("lastAccessed", new Date());
        req.setAttribute("lastAccessed", lastAccessed);
        req.getRequestDispatcher("session.jsp").forward(req, resp);
    }
}
