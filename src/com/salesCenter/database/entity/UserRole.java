package com.salesCenter.database.entity;

/**
 * UserRole object JavaBean class
 * @author afaherty
 * @version 1.0 on 01/31/2018
 */
public class UserRole {

    private int    roleId;
    private String roleName;
    private String userName;

    /**
     * Zero arg contructor
     */
    public UserRole() {

    }

    /**
     * UserRole object overloaded constructor
     * @param roleId    refers to id of users role
     * @param roleName  refers to role name of user
     * @param userName  refers to users username
     */
    public UserRole(int roleId, String roleName, String userName) {

        this.roleId   = roleId;
        this.roleName = roleName;
        this.userName = userName;
    }

    /**
     * retrieve roleId value
     * @return roleId
     */
    public int getRoleId() {
        return roleId;
    }

    /**
     * Set value to roleId
     * @param roleId value of roleId
     */
    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    /**
     * retrieve roleName value
     * @return roleName
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Set value to roleName
     * @param roleName value of roleName
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Retrieve value of userName
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Set value to userName
     * @param userName value of userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
