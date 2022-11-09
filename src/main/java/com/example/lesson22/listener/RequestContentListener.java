package com.example.lesson22.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestContentListener implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent requestEvent) {
        String contentType = requestEvent.getServletRequest().getContentType();
        int contentLength = requestEvent.getServletRequest().getContentLength();

        System.out.printf(String.format("Request content: %s %s bytes \n", contentType, contentLength));
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("Request Destroyed");
    }
}
