package ro.teamnet.zth.web;


import ro.teamnet.zth.file.LogFileWriter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Created by user on 7/14/2016.
 */
public class HeadersLogFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        LogFileWriter lfr = new LogFileWriter();
        filterChain.doFilter(servletRequest, servletResponse);
        Enumeration e = ((HttpServletRequest)servletRequest).getHeaderNames();
        while(e.hasMoreElements()){
            String s  =  e.nextElement().toString();
            lfr.logHeader(s, ((HttpServletRequest)servletRequest).getHeader(s));
        }
    }

    @Override
    public void destroy() {

    }
}
