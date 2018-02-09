package com.salesCenter;

import com.salesCenter.database.dataAccess.UserDao;
import com.salesCenter.database.dataAccess.UserRoleDao;
import org.apache.log4j.Logger;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.Properties;

@WebServlet(
        name            = "appStartup",
        urlPatterns     = "/salesCenterStartup",
        loadOnStartup   = 1
)

/**
 * Start up class to initialize data for application
 * @author afaherty27
 * @version 1.0 on 02/08/2018
 */
public class ApplicationStartup extends HttpServlet {

    //create log4j Logger object instance
    private final Logger log = Logger.getLogger(this.getClass());

    // declare instance variables
    private Properties  properties;
    private UserDao     userDao;
    private UserRoleDao userRoleDao;

    /**
     * Load properties and DAOs into application at startup
     */

    /**
     * Load properties file into application
     */

    /**
     * Instantiate new UserDao object
     */

    /**
     * Instantiate new User object
     */


}
