package com.lin.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lhy
 * @date 2018/11/14 15:03
 */
@WebListener
public class CustomContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("----context init");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("-----context destroy");
    }

}
