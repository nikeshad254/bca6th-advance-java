package main.java;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Login extends HttpServlet {

    Connection connection;

    public void init(){
        String url = "jdbc:mysql://localhost:3306/my_db";
        String user = "root";
        String password = "nist254";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    boolean isUserLoggedIn(String username, String password){
        String query =  "Select * from student where username=? and password=?";
        try {
            PreparedStatement stmt = this.connection.prepareStatement(query);
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet userExistRs = stmt.executeQuery();
            return userExistRs.next();
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
//        super.doPost(req, resp);
        String username = req.getParameter("username");
        String password = req.getParameter("password");

            if(isUserLoggedIn(username, password)){
                resp.sendRedirect("/serverletProject/success.jsp?uname="+username);

//                req.setAttribute("uname", username);
//                RequestDispatcher  rd = req.getRequestDispatcher("success.jsp");
//                rd.forward(req, resp);
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

    @Override
    public void destroy() {
//        super.destroy();
        try {
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
