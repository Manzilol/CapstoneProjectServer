package com.example.VeloVault.models;

import javax.persistence.*;
import java.security.acl.Owner;
import java.util.ArrayList;
import java.util.List;

//@Inheritance
//@Entity
@Table(name = "items")
public abstract class Item {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "brand")
    private String brand;

    @Column(name = "ratings")
    private List<Integer> ratings;

    @Column(name = "comments")
    private List<String> comments;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Item(String name, String brand, List<Integer> ratings, List<String> comments, User user) {
        this.name = name;
        this.brand = brand;
        this.ratings = ratings;
        this.comments = comments;
        this.user = user;
    }

    public Item() {
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

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

    public List<Integer> getRatings() {
        return ratings;
    }

    public void setRatings(List<Integer> ratings) {
        this.ratings = ratings;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
