package com.example.lesson22.filter;

import javax.servlet.FilterChain;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;

@WebFilter(displayName = "AccessLogFilter", urlPatterns = "/*")
public class AccessLogFilter extends HttpFilter {

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = request.getSession();

        String httMethod = request.getMethod();
        String requestURI = request.getRequestURI(); // вернет путь по которому был вызван наш запрос
        String ipAddress = request.getRemoteAddr();// дает IP адрес с которого пришел запрос
        System.out.printf("Request details: %s %s %s %s \n", httMethod, requestURI, ipAddress, LocalDateTime.now());

        chain.doFilter(request,response);
    }
}
