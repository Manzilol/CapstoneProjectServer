package com.example.VeloVault.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_Date")
    private String startDate;

    @Column(name = "end_Date")
    private String endDate;

    @ManyToOne
    @JsonIgnoreProperties({"user", "myItems", "borrowedItems"})
//    @JsonBackReference
    private User user;

    @ManyToOne
    @JsonIgnoreProperties({"bookings"})
    private Item item;

    public Booking(String startDate, String endDate, User user, Item item) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.item = item;
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}