package com.example.VeloVault.models;

import com.example.VeloVault.models.mainCatagory.Bag;
import com.example.VeloVault.models.mainCatagory.subCatagory.*;
import com.example.VeloVault.repositories.BookingRepository;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
//include = JsonTypeInfo.As.EXISTING_PROPERTY,
//property = "type"
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME )
@JsonSubTypes({
        @JsonSubTypes.Type(value = Tent.class, name = "tent"),
        @JsonSubTypes.Type(value = Bag.class, name = "bag"),
        @JsonSubTypes.Type(value = Waterproof.class, name = "waterproof"),
        @JsonSubTypes.Type(value = Stove.class, name = "stove"),
        @JsonSubTypes.Type(value = SleepingMat.class, name = "sleeping_mat"),
        @JsonSubTypes.Type(value = SleepingBag.class, name = "sleeping_bag"),
        @JsonSubTypes.Type(value = Road.class, name = "road"),
        @JsonSubTypes.Type(value = PowerBank.class, name = "power_bank"),
        @JsonSubTypes.Type(value = OffRoad.class, name = "off_road"),
        @JsonSubTypes.Type(value = Navigation.class, name = "navigation"),
        @JsonSubTypes.Type(value = Lighting.class, name = "lighting"),
        @JsonSubTypes.Type(value = Insulated.class, name = "insulated"),
        @JsonSubTypes.Type(value = Crockery.class, name = "crockery"),
        @JsonSubTypes.Type(value = BivvyBag.class, name = "bivvy_bag"),

})

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

    @JsonIgnoreProperties({"items", "subCategorys"})
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @JsonIgnoreProperties({"items", "category"})
    @ManyToOne
    @JoinColumn(name = "sub_category_id")
    private SubCategory subCategory;

    public Item(String name, String brand, List<Integer> ratings, List<String> comments, User user, Category category, SubCategory subCategory) {
        this.name = name;
        this.brand = brand;
        this.ratings = new ArrayList<>();
        this.comments = new ArrayList<>();
        this.bookings = new ArrayList<>();
        this.user = user;
        this.category = category;
        this.subCategory = subCategory;
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

//    public int getBookingListSize(){
//        return bookings.size();
//    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public void rentItem(User user, Item item, Date startDate, Date endDate, BookingRepository bookingRepository){
        bookingRepository.save(new Booking(startDate, endDate, user, item));
//        Booking booking = new Booking(startDate, endDate, user, item);
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }
}
