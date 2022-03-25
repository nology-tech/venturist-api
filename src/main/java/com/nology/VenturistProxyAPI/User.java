package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {

    private String userID;
    private String firstName;
    private String lastName;
    private String middleNames;
    private List<Holding> holdings;
    private List<Integer> contacts;

    public User(String userID, String firstName, String lastName, String middleNames, List<Holding> holdings, List<Integer> contacts) {
        this.userID = userID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleNames = middleNames;
        this.holdings = holdings;
        this.contacts = contacts;
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

    public List<Holding> getHoldings() {
        return holdings;
    }

    public List<Integer> getContacts() {
        return contacts;
    }
}
