package com.example.VeloVault.models.mainCatagory;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Bag extends Item {

    @Column(name = "bag_Location")
    private String bagLocation;

    @Column(name = "capacity")
    private int capacity;

    public Bag(String name, String brand, List<Integer> ratings, List<String> comments, User user, String bagLocation, int capacity) {
        super(name, brand, ratings, comments, user);
        this.bagLocation = bagLocation;
        this.capacity = capacity;
    }

    public Bag() {
    }

    public String getBagLocation() {
        return bagLocation;
    }

    public void setBagLocation(String bagLocation) {
        this.bagLocation = bagLocation;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
