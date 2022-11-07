package com.example.lesson22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/")
public class FormServlet extends HttpServlet {

    @Override
    // метод doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h1>Please provide your name:</h1>" +
                "<body>" +
                "<from action=\"/hello\" method=\"POST\">" + //на какой сервлет вызвать и на какой метод отправить
                "<input type=\"text\" name=\"name\"><br>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</from>" +
                "</body>" +
                "</html>");
    }
}
