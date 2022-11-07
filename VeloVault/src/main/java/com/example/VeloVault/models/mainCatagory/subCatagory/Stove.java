package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.FuelType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Cooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class Stove extends Cooking {

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "fuelType")
    @Enumerated(value = EnumType.STRING)
    private FuelType fuelType;

    @Column(name = "allInOne")
    private boolean allInOne;

    public Stove(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int diameter, FuelType fuelType, boolean allInOne, Category category) {
        super(name, brand, ratings, comments, user, weight, category);
        this.diameter = diameter;
        this.fuelType = fuelType;
        this.allInOne = allInOne;
    }

    public Stove() {
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }
}
