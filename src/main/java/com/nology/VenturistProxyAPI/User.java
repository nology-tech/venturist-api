package com.nology.VenturistProxyAPI;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.List;

    @Entity
    @Table(name="users")
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
