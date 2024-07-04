package main.java;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import javax.swing.*;
import java.io.IOException;
import java.io.PrintWriter;

public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        super.doPost(req, resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if(username.equals("admin") && password.equals("admin")) {
//            JOptionPane.showMessageDialog(null, "Login Sucessfully");
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome " + username + "</h1>");
            out.println("<script>alert('Login Successful')</script>");
            out.println("</body>");
            out.println("</html>");
        }else{
            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Login Failed Try Again</h1>");
            out.println("<a href='/serverletProject/login.jsp'>Try Again</a>");
            out.println("<script>alert('Login Unsuccessful')</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
