package com.htp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    public FrontController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doRequest(req, resp);
    }


    private void doRequest(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("MY_LOGGING: from doRequest method, START :)");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bye");
        if (requestDispatcher != null) {
            requestDispatcher.forward(req, resp);
            System.out.println("MY_LOGGING: from doRequest method from /FrontController into /bye without errors! ");
        }
    }
}
