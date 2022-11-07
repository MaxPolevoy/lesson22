package com.example.lesson22.homework;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

/* Задача 1. Создать сервлет для вывода текущей даты и времени.
        Дополнительное задание*/

@WebServlet(name = "DateTimeServlet", urlPatterns = "/date")
public class DateTimeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        Date currentDate = new Date();
        writer.println("<html>" +
                "<head>" +
                "<title>" + "Date and Time" + "</title>" +
                "</head>" +
                "<body>" +
                currentDate.toString() +
                "</body>" +
                "</html>");
    }
 /*   @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }*/
}
