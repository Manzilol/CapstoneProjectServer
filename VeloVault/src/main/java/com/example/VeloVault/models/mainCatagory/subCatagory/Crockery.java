package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Cooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Crockery extends Cooking {

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "capacity")
    private int capacity;

    public Crockery(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int diameter, int capacity, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, weight, category, subCategory);
        this.diameter = diameter;
        this.capacity = capacity;
    }

    public Crockery() {
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
