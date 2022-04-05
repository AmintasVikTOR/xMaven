package com.htp.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Currencies extends HttpServlet {

    public Currencies() {
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
        System.out.println("MY_LOGGING: Currencies started..");
        // RequestDispatcher requestDispatcher = req.getRequestDispatcher("https://www.nbrb.by/api/exrates/rates/431");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/nbrb");
        if (requestDispatcher != null) {
            requestDispatcher.forward(req, resp);
            System.out.println("MY_LOGGING: Log's Currencies! ");
        }
    }
}
