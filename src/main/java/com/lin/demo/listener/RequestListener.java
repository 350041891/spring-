package com.lin.demo.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author lhy
 * @date 2018/11/14 15:05
 */
@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("-----请求结束");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("----请求开始");

    }
}
