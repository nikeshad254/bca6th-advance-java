package main.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class MyCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
         Cookie[] cookies =  req.getCookies();
         resp.setContentType("text/html");
         PrintWriter out = resp.getWriter();
         out.println("<html>" +
                 "<body>" +
                 "<h1>Cookies</h1>");

         for (Cookie cookie : cookies) {
             out.println("<h2>" + cookie.getName() + ": " + cookie.getValue() + "</h2>");
         }

        out.println("</body> </html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        String cookieName = req.getParameter("cookieName");
        String cookieValue = req.getParameter("cookieValue");

        resp.addCookie(new Cookie(cookieName, cookieValue));

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html>" +
                "<body>" +
                "<h1>" + cookieName  + " : "+ cookieValue+" Added!! </h1>" +
                "</body>" +
                "</html>");
    }
}
