package com.salesCenter.database.dataAccess;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;



/**
 * Create hibernate session instance
 * @author afaherty27
 * @version 1.0 on 02/08/2018
 *
 */
public class SessionFactoryProvider {

    //private instance var refrencing SessionFactory object
    private static SessionFactory sessionFactory;

    /**
     * Instantiate new SessionFactory object
     * Load configuration details
     */
    public static void createSessionFactory() {

        // instantiate new Configuration obj
        Configuration config = new Configuration();

        // apply mapping and properties in hibernate config file
        config.configure();

        // instantiate ServiceRegistry obj.  Apply value of Configuration object instance variable
        ServiceRegistry registry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();


        //instantiate new SessionFactory.  apply properties and mappings
        sessionFactory = config.buildSessionFactory(registry);

    }

    /**
     * Instantiate SessionFactory obj if non exists
     * @return sessionFactory
     */
    public static SessionFactory getSessionFactory() {

        //if SessionFactory  is null
        if (sessionFactory == null) {

            //create new SessionFactory obj
            createSessionFactory();
        }

        //return SessionFactory to program
        return sessionFactory;
    }
}
