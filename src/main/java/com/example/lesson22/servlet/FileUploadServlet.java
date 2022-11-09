package com.example.lesson22.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;

@WebServlet(name = "upload", urlPatterns = "/upload")
@MultipartConfig(
        fileSizeThreshold = 1024 * 1024 * 1, // 1Mb
        maxFileSize = 1024 * 1024 * 1, // 10Mb
        maxRequestSize = 1024 * 1024 * 1 // 100Mb
)
public class FileUploadServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Part filePart = request.getPart("file");
        String fileName = filePart.getSubmittedFileName();
        for (Part part : request.getParts()) {
            part.write("c:\\Users\\62635\\IdeaProjects\\TMS2\\lesson22\\" + fileName);
        }
        response.getWriter().print("The file uploaded successfully.");
    }
}
