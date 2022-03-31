package com.nology.VenturistProxyAPI;

import javax.persistence.*;

@Entity
@Table(name="contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String contactName;
    private String bankName;
    private String accountNumber;
    private String sortCode;


    public Contacts() {
    }

    public Contacts(String userID, String contactName, String bankName, String accountNumber, String sortCode) {
        this.userID = userID;
        this.contactName = contactName;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
    }

    public String getContactName() {
        return contactName;
    }

    public String getBankName() {
        return bankName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setSortCode(String sortCode) {
        this.sortCode = sortCode;
    }
}
