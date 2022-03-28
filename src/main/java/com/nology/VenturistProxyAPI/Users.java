package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Users {
    @Id
    private String userID;
    private String firstName;
    private String lastName;
    private String middleNames;


    public Users(String userID, String firstName, String lastName, String middleNames) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleNames = middleNames;

    }

    public Users() {

    }

    public String getUserID() {
        return userID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleNames() {
        return middleNames;
    }


}
