package com.salesCenter;

import org.apache.log4j.Logger;

import javax.servlet.annotation.*;
import javax.servlet.*;
import javax.servlet.http.*;

import java.io.IOException;

@WebServlet(
        name = "adoptHome",
        urlPatterns = {"/use/adopt-a-car"}
)

/**
 *
 * redirect class for adoptACar.jsp page
 * @author Adam Faherty
 * @version 1.0 02/01/2018
 */
public class AdoptACarForward extends HttpServlet {

    private final Logger log = Logger.getLogger(AdoptACarForward.class);

    public void goGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }


}
