package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Clothing;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Waterproof extends Clothing {

    @Column(name = "waterproofRating")
    private String waterproofRating;

    public Waterproof(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, String waterproofRating, Category category) {
        super(name, brand, ratings, comments, user, size, category);
        this.waterproofRating = waterproofRating;
    }

    public Waterproof() {
    }

    public String getWaterproofRating() {
        return waterproofRating;
    }

    public void setWaterproofRating(String waterproofRating) {
        this.waterproofRating = waterproofRating;
    }
}
