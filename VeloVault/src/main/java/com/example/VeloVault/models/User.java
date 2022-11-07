package com.example.VeloVault.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {


    @Id
    private String fireBaseId;

    @Column(name = "name")
    private String name;

    @Column(name = "email")
    private String email;

    @JsonIgnoreProperties({"user"})
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Item> myItems;

    @JsonIgnoreProperties({"user", "bookings"})
    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Item> borrowedItems;

    public User(String fireBaseId, String name, String email) {
        this.fireBaseId = fireBaseId;
        this.name = name;
        this.email = email;
        this.myItems = new ArrayList<>();
        this.borrowedItems = new ArrayList<>();
    }

    public User() {

    }

    public String getFireBaseId() {
        return fireBaseId;
    }

    public void setFireBaseId(String fireBaseId) {
        this.fireBaseId = fireBaseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Item> getMyItems() {
        return myItems;
    }

    public void setMyItems(List<Item> myItems) {
        this.myItems = myItems;
    }

    public List<Item> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<Item> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}