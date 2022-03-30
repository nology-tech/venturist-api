package com.nology.VenturistProxyAPI;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String bankName;
    private String accountNumber;
    private String sortCode;
    private String nameOnAccount;
//    private Address address;

    public BankAccount(String userID, String bankName, String accountNumber, String sortCode, String nameOnAccount
//                       Address address
    ) {
        this.userID = userID;
        this.bankName = bankName;
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.nameOnAccount = nameOnAccount;
//        this.address = address;
    }

    public BankAccount() {

    }

    public int getId() {
        return id;
    }

    public String getUserID() {
        return userID;
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

    public String getNameOnAccount() {
        return nameOnAccount;
    }
//
//    public Address getAddress() {
//        return address;
//    }
}
