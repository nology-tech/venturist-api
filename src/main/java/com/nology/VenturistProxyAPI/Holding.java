package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Holding {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String currencyName;
    private double amount;
    private String currencyCode;
    private String currencySymbol;

    public Holding(String userID, String currencyName, double amount, String currencyCode, String currencySymbol) {
        this.userID = userID;
        this.currencyName = currencyName;
        this.amount = amount;
        this.currencyCode = currencyCode;
        this.currencySymbol = currencySymbol;
    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencySymbol() {
        return currencySymbol;
    }
}
