package com.nology.VenturistProxyAPI;

import javax.persistence.*;

@Entity
@Table(name="contacts")
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String user_ID;
    private String contact_User_Id;

    public Contacts() {
    }

    public Contacts(String user_ID, String contact_User_Id) {
        this.user_ID = user_ID;
        this.contact_User_Id = contact_User_Id;
    }

    public int getId() {
        return id;
    }

    public String getUser_ID() {
        return user_ID;
    }

    public String getContact_User_Id() {
        return contact_User_Id;
    }
}
