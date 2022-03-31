package com.nology.VenturistProxyAPI;

import javax.persistence.*;

@Entity
@Table(name = "bankAccounts")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String userID;
    private String bankName;
    private String bankAccountNo;
    private String sortCode;
    private String nameOnAccount;


    public BankAccount(String userID, String bankName, String bankAccountNo, String sortCode, String nameOnAccount) {
        this.userID = userID;
        this.bankName = bankName;
        this.bankAccountNo = bankAccountNo;
        this.sortCode = sortCode;
        this.nameOnAccount = nameOnAccount;
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

    public String getBankAccountNo() {
        return bankAccountNo;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getNameOnAccount() {
        return nameOnAccount;
    }
}
