package com.salesCenter;

import org.apache.log4j.Logger;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(
        name = "adoptHome",
        urlPatterns = {"/user/adopt"}
)

/**
 *
 * redirect class for adoptACar.jsp page
 * @author Adam Faherty
 * @version 1.0 02/01/2018
 */
public class AdoptACarForward extends HttpServlet {

    private final Logger log = Logger.getLogger(AdoptACarForward.class);

    /**
     * forward to adoptACar.jsp
     * @param request   HttpServletRequest object
     * @param response  HttpServletResponse object
     * @throws ServletException if there is a servlet error
     * @throws IOException if there is an input/output error
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String url = "/user/adoptACar.jsp";

        log.debug("Opening " + url);

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
        dispatcher.forward(request, response);
    }


}
