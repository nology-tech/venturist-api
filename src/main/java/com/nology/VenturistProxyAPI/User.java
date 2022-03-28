package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {
    @Id
    private String userID;
    private String firstName;
    private String lastName;
    private String middleNames;


    public User(String userID, String firstName, String lastName, String middleNames) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleNames = middleNames;

    }

    public User() {

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
