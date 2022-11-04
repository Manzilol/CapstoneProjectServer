package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Electronic;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class PowerBank extends Electronic {

    @Column(name = "capacity")
    private int capacity;

    @Column(name = "dimensions")
    private String dimensions;

    public PowerBank(String name, String brand, List<Integer> ratings, List<String> comments, User user, boolean rechargeable, int capacity, String dimensions, Category category) {
        super(name, brand, ratings, comments, user, rechargeable, category);
        this.capacity = capacity;
        this.dimensions = dimensions;
    }

    public PowerBank() {
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
