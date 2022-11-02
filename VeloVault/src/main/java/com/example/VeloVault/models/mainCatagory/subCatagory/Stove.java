package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Cooking;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Stove extends Cooking {

    @Column(name = "diameter")
    private int diameter;

    @Column(name = "fuelType")
    private String fuelType;

    @Column(name = "allInOne")
    private boolean allInOne;

    public Stove(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int diameter, String fuelType, boolean allInOne) {
        super(name, brand, ratings, comments, user, weight);
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public boolean isAllInOne() {
        return allInOne;
    }

    public void setAllInOne(boolean allInOne) {
        this.allInOne = allInOne;
    }
}
