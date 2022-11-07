package com.example.VeloVault.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "ratings")
public class RatingsCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "rating")
    private  int rating;

    @ManyToOne
    @JsonIgnoreProperties({"ratings", "category", "subCategory"})
    @JoinColumn(name = "itemId", nullable = false)
    private Item item;

    public RatingsCollection(int rating, Item item) {
        this.rating = rating;
        this.item = item;
    }

    public RatingsCollection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
