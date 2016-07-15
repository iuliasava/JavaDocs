package ro.teamnet.zth.web;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by user on 7/14/2016.
 */
public class HttpServletInclude extends HttpServlet {

    /**
     * This method is used to map a GET request from the client side
     * @param request the HttpServletRequest instance
     * @param response the HttpServletResponse instance
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/hello4");

        requestDispatcher.include(request, response);

        String user = "";

        // Set the response type
        response.setContentType("text/html");

        // Obtain the user from the request instance
        user = request.getParameter("user");

        //Write the response content
        response.getWriter().write("Hello <b>" + user + "</b> from the Included Servlet " + request.getAttribute("testAttribute"));
    }

}

