package com.itboy.DACNPM.Model;

import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;
    private String emailUser;
    private String password;
    private String firstName;
    private String lastName;
    private String numberPhone;
    @OneToOne
    private Address address;
    private boolean store;

    public User(long idUser, String emailUser, String password, String firstName, String lastName, String numberPhone, Address address, boolean store) {
        this.idUser = idUser;
        this.emailUser = emailUser;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberPhone = numberPhone;
        this.address = address;
        this.store = store;
    }

    public User() {

    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public boolean isStore() {
        return store;
    }

    public void setStore(boolean store) {
        this.store = store;
    }
}
