package com.htp.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class StartApplicationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Listener: Application started!");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Listener: Application stopped!");
    }
}
