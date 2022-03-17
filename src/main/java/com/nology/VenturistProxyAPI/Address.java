//package com.nology.VenturistProxyAPI;
//
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//
//@Entity
//public class Address {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    private String postCode;
//    private String address;
//    private String city;
//    private String country;
//    private int userID;
//    private int bankAccountID;
//
//    public Address(String postCode, String address, String city, String country, int userID, int bankAccountID) {
//        this.postCode = postCode;
//        this.address = address;
//        this.city = city;
//        this.country = country;
//        this.userID = userID;
//        this.bankAccountID = bankAccountID;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getPostCode() {
//        return postCode;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//}
