package org.example.web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "simpleServlet", urlPatterns = "/servlet")
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("----> HANDLE HTTP REQUEST USING SERVLET");
        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        printWriter.write("GET RESPONSE FROM SERVLET");
        printWriter.flush();
    }
}
