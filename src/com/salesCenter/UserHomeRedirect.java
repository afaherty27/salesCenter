package com.salesCenter;

import org.apache.log4j.Logger;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(
        name = "userHome",
        urlPatterns = {"/user"}
)

/**
 *
 * redirect class for user.jsp page
 * @author Adam Faherty
 * @version 1.0 01/30/2018
 */
public class UserHomeRedirect extends HttpServlet {


    private final Logger log = Logger.getLogger(UserHomeRedirect.class);
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        redirectUser(response);
    }

    /**
     * Redirect user to user.jsp
     * @param response      HttpServletResponse object
     * @throws IOException if there is an inout/output error
     */
    public void redirectUser(HttpServletResponse response) throws IOException {

        String url = "/user/user.jsp";

        log.debug("Accessing: " + url);

        response.sendRedirect(url);

        log.debug(url + " has successfully been loaded");
   }


}
