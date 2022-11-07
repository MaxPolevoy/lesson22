package com.example.lesson22;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    // метод doGet
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();//реализация класса getWriter у респонса
        writer.println("<html>" +
                "<h1>Hello, stranger!</h1>" +
                "<h2>Please navigate to <a href=\"/\">main page</a> and introduce yourself</h2>" +
                "</html>"); //позволяет в ответ сервлета добавить текст
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();//реализация класса getWriter у респонса

        String name = request.getParameter("name");
        writer.println(String.format("<html><h1>Hello, %s!</h1></html>", name));

    }
}