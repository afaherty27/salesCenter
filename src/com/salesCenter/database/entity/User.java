package com.salesCenter.database.entity;

/**
 * User object JavaBean class
 * @author afaherty27
 * @version 1.0 on 01/31/2018
 */
public class User {

    //inst vars relating to DB columns with get & set methods
    private int      userId;
    private String   userName;
    private String   userFirstName;
    private String   userLastName;
    private String   userPass;
    private int      userPhone;
    private UserRole userRole;

    /**
     * zero arg constructor
     * */
    public User() {

    }

    /**
     * User object overloaded constructor
     * @param userId        ref to users id number
     * @param userName      ref to users username
     * @param userFirstName ref to users first name
     * @param userLastName  ref to users last name
     * @param userPass      ref to users password
     * @param userPhone     ref to users phone number
     * @param userRole      ref to users role
     */
    public User(int userId, String userName, String userFirstName, String userLastName, String userPass,
                int userPhone, UserRole userRole) {

        this.userId        = userId;
        this.userName      = userName;
        this.userFirstName = userFirstName;
        this.userLastName  = userLastName;
        this.userPass      = userPass;
        this.userPhone     = userPhone;
        this.userRole      = userRole;
    }
}
