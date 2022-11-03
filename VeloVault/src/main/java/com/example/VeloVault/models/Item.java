package com.example.VeloVault.models;

import com.example.VeloVault.repositories.BookingRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
//@Table(name = "items")
public abstract class Item {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @JsonIgnoreProperties({"item"})
    @OneToMany(mappedBy = "item")
    private List<RatingsCollection> ratings;

    @JsonIgnoreProperties({"item"})
    @OneToMany(mappedBy = "item")
    private List<CommentsCollection> comments;

    @JsonIgnoreProperties({"item", "myItems", "borrowedItems"})
    @ManyToOne
    @JoinColumn(name = "ownerId", nullable = false)
    private User user;

    @JsonIgnoreProperties({"item"})
    @OneToMany(mappedBy = "item")
    private List<Booking> bookings;


    public Item(String name, String brand, List<Integer> ratings, List<String> comments, User user) {
        this.name = name;
        this.brand = brand;
        this.ratings = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.user = user;
    }

    public Item() {
    }

    public List<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<RatingsCollection> getRatings() {
        return ratings;
    }

    public void setRatings(List<RatingsCollection> ratings) {
        this.ratings = ratings;
    }

    public List<CommentsCollection> getComments() {
        return comments;
    }

    public void setComments(List<CommentsCollection> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getBookingListSize(){
        return bookings.size();
    }

    public void rentItem(User user, Item item, String startDate, String endDate, BookingRepository bookingRepository){
        bookingRepository.save(new Booking(startDate, endDate, user, item));
//        Booking booking = new Booking(startDate, endDate, user, item);
    }
}
