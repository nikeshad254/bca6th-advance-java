package main.java;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddNumbers extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head>");
        out.println("<title>Add Numbers</title>");
        out.println("</head><body>");
        out.println("<form action'/' method='POST'>");
        out.println("<h1>Add Numbers</h1>");
        out.println("<input type='text' name='number1' placeholder='Enter number 1'>");
        out.println("<input type='text' name='number2' placeholder='Enter number 2'>");
        out.println("<input type='submit' value='Submit'>");
        out.println("</form>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse resp) throws IOException {
        int number1 = Integer.parseInt(request.getParameter("number1"));
        int number2 = Integer.parseInt(request.getParameter("number2"));

        int sum = number1 + number2;

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<html><head>");
        out.println("<title>Answer Time</title>");
        out.println("</head><body>");
        out.println("<h1> The answer is: "+sum+"</h1>");
        out.println("<a href='/serverletProject'>Return To The home</a>");
        out.println("</body></html>");


    }
}
