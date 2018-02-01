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

    /**
     * Retrieve userId value
     * @return userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * Set value to userId
     * @param userId    value of user id
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * Retrieve userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set value to userName
     * @param userName  value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Retrieve users first name
     * @return userFirstName
     */
    public String getUserFirstName() {
        return userFirstName;
    }

    /**
     * Set value to userFirstName
     * @param userFirstName value of users first name
     */
    public void setUserFirstName(String userFirstName) {
        this.userFirstName = userFirstName;
    }

    /**
     * Retrieve users last name
     * @return userLastName
     */
    public String getUserLastName() {
        return userLastName;
    }

    /**
     * Set value to userLastName
     * @param userLastName value of users last name
     */
    public void setUserLastName(String userLastName) {
        this.userLastName = userLastName;
    }

    /**
     * Retrieve userPass
     * @return userPass
     */
    public String getUserPass() {
        return userPass;
    }

    /**
     * Set value to userPass
     * @param userPass value of users password
     */
    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    /**
     * Retrieve userPhone
     * @return userPhone
     */
    public int getUserPhone() {
        return userPhone;
    }

    /**
     * Set value to userPhone
     * @param userPhone value of users phone
     */
    public void setUserPhone(int userPhone) {
        this.userPhone = userPhone;
    }

    /**
     * Retrieve value of userRole
     * @return userRole
     */
    public UserRole getUserRole() {
        return userRole;
    }

    /**
     * Set value to userRole
     * @param userRole userRole
     */
    public void setUserRole(UserRole userRole) {
        this.userRole = userRole;
    }
}
