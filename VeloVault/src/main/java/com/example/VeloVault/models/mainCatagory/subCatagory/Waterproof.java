package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.WaterproofRatingType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Clothing;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Waterproof extends Clothing {

    @Column(name = "waterproofRatingType")
    private WaterproofRatingType waterproofRatingType;

    public Waterproof(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, WaterproofRatingType waterproofRating, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, size, category, subCategory);
        this.waterproofRatingType = waterproofRatingType;
    }

    public Waterproof() {
    }

    public WaterproofRatingType getWaterproofRatingType() {
        return waterproofRatingType;
    }

    public void setWaterproofRatingType(WaterproofRatingType waterproofRatingType) {
        this.waterproofRatingType = waterproofRatingType;
    }
}
