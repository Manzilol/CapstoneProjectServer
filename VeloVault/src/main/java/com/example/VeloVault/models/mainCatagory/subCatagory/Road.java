package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.BrakeType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Bike;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class Road extends Bike {

    @Column(name = "brakeType")
    @Enumerated(value = EnumType.STRING)
    private BrakeType brakeType;

    public Road(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, BrakeType brakeType, Category category) {
        super(name, brand, ratings, comments, user, size, category);
        this.brakeType = brakeType;
    }

    public Road() {
    }

    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }
}
