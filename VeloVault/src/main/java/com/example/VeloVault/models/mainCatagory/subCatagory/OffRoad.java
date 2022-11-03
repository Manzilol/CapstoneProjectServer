package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Bike;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class OffRoad extends Bike {

    @Column(name = "suspensionType")
    private String suspensionType;

    public OffRoad(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, String suspensionType) {
        super(name, brand, ratings, comments, user, size);
        this.suspensionType = suspensionType;
    }

    public OffRoad() {
    }

    public String getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(String suspensionType) {
        this.suspensionType = suspensionType;
    }
}
