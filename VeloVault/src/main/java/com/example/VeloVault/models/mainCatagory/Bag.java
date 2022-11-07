package com.example.VeloVault.models.mainCatagory;

import com.example.VeloVault.Enums.BagLocationType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class Bag extends Item {

    @Column(name = "bag_Location_Type")
    @Enumerated(value = EnumType.STRING)
    private BagLocationType bagLocationType;

    @Column(name = "capacity")
    private int capacity;

    public Bag(String name, String brand, List<Integer> ratings, List<String> comments, User user, BagLocationType bagLocationType, int capacity, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, category, subCategory);
        this.bagLocationType = bagLocationType;
        this.capacity = capacity;
    }

    public Bag() {
    }

    public BagLocationType getBagLocationType() {
        return bagLocationType;
    }

    public void setBagLocationType(BagLocationType bagLocationType) {
        this.bagLocationType = bagLocationType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
