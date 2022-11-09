package com.example.lesson22.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "FormServlet", urlPatterns = "/")
public class FormServlet extends HttpServlet {

    @Override
    // метод doPost
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter writer = response.getWriter();
        HttpSession session = request.getSession();
        Object user = session.getAttribute("user");


        writer.println("<html>" +
                "<body>" +
                "<h1>Please provide your name:</h1>" +
                "<from action=\"/hello\" method=\"POST\">" + //на какой сервлет вызвать и на какой метод отправить
                "<input type=\"text\" name=\"name\"><br>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</from>" +
                "<br><br>" +
                "<h1>Please choose file to upload:<h1>" +
                "<from action=\"/upload\" method=\"POST\" enctype=\"multipart/from-data\">" +
                "<input type=\"file\" name=\"file\"><br>" +
                "<input type=\"submit\" value=\"Upload\"/>" +
                "</from>" +
                "</body>" +
                "</html>");
    }
}
