package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Electronic;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Lighting extends Electronic {

    @Column(name = "lumens")
    private int lumens;

    @Column(name = "lightingType")
    private String lightingType;

    public Lighting(String name, String brand, List<Integer> ratings, List<String> comments, User user, boolean rechargeable, int lumens, String lightingType, Category category) {
        super(name, brand, ratings, comments, user, rechargeable, category);
        this.lumens = lumens;
        this.lightingType = lightingType;
    }

    public Lighting() {
    }

    public int getLumens() {
        return lumens;
    }

    public void setLumens(int lumens) {
        this.lumens = lumens;
    }

    public String getLightingType() {
        return lightingType;
    }

    public void setLightingType(String lightingType) {
        this.lightingType = lightingType;
    }
}
