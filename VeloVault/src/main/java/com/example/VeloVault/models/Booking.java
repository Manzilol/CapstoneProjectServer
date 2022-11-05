package com.example.VeloVault.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "bookings")
public class Booking {

    private static SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy"); // FYI, not thread-safe! ;)

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_Date")
    private Date startDate;

    @Column(name = "end_Date")
    private Date endDate;

    @ManyToOne
    @JsonIgnoreProperties({"user", "myItems", "borrowedItems"})
//    @JsonBackReference
    private User user;

    @ManyToOne
    @JsonIgnoreProperties({"bookings"})
    private Item item;

    public Booking(Date startDate, Date endDate, User user, Item item) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.user = user;
        this.item = item;
    }

    public Booking(String startDate, String endDate, User user, Item item) throws ParseException {
        this(DATE_FORMAT.parse(startDate), DATE_FORMAT.parse(endDate), user, item);
    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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