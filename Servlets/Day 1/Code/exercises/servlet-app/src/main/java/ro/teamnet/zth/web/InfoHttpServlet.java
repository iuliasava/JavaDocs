package ro.teamnet.zth.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;


/**
 * Created by user on 7/13/2016.
 */
    public class InfoHttpServlet extends HttpServlet {

    /**
     * This method is used to map a GET request from the client side
     *
     * @param request  the HttpServletRequest instance
     * @param response the HttpServletResponse instance
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder r = new StringBuilder();
        r.append("<table>");
        Enumeration headers = request.getHeaderNames();

        while(headers.hasMoreElements()){
            String name = headers.nextElement().toString();
            r.append("<tr><th>" + name + "</th>" );
            r.append("<th>" + request.getHeader(name) + "</th>"+ "</tr>");
        }
        r.append("</table>");
        response.getWriter().write(r.toString());
    }

}

