package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Bikes;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Road extends Bikes {

    @Column(name = "brakeType")
    private String brakeType;

    public Road(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, String brakeType) {
        super(name, brand, ratings, comments, user, size);
        this.brakeType = brakeType;
    }

    public Road() {
    }

    public String getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(String brakeType) {
        this.brakeType = brakeType;
    }
}
