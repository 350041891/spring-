package com.lin.demo.filter;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author lhy
 * @date 2018/11/14 14:35
 */
//@WebFilter(urlPatterns = "/v1/*",filterName = "loginFilter")
//@Order(Ordered.LOWEST_PRECEDENCE)
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter excute");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String username = req.getParameter("username");
        if("lin".equals(username)){
            filterChain.doFilter(servletRequest,servletResponse);
        }else{
            resp.sendRedirect("/index.html");
        }
    }

    @Override
    public void destroy() {

    }
}
