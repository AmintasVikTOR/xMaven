package com.htp.filter;
/*
Filter: HTTP-request's converted to UTF8
*/

import javax.servlet.*;
import java.io.IOException;


public class CharsetFilter implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        System.out.println("In charset filter!");
        chain.doFilter(request, response);


    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void destroy() {

    }
}
