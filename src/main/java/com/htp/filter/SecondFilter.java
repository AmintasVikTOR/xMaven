package com.htp.filter;
/*
Filter: HTTP-request's converted to UTF8
*/

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;


public class SecondFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        if (StringUtils.isNotBlank(((HttpServletRequest) request).getHeader("Custom-Header"))) {

            System.out.println("Second Filter; IF; success");
        } else {

            System.out.println("Second Filter; ELSE; success");

        }

        chain.doFilter(request, response);


    }


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}

