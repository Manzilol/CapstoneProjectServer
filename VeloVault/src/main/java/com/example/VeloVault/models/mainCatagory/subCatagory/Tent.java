package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.PoleType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Camping;

import javax.persistence.*;
import java.util.List;

//@Inheritance
@Entity
//@Table(name = "tents")
public class Tent extends Camping {


    @Column(name = "capacity")
    private int capacity;

    @Column(name = "packSize")
    private String packSize;

    @Column(name = "footprint")
    private boolean footprint;

    @Column(name = "poleType")
    @Enumerated(value = EnumType.STRING)
    private PoleType poleType;

    public Tent(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int capacity, String packSize, boolean footprint, PoleType poleType, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, weight, category, subCategory);
        this.capacity = capacity;
        this.packSize = packSize;
        this.footprint = footprint;
        this.poleType = poleType;
    }

    public Tent() {
    }


    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public boolean isFootprint() {
        return footprint;
    }

    public void setFootprint(boolean footprint) {
        this.footprint = footprint;
    }

    public PoleType getPoleType() {
        return poleType;
    }

    public void setPoleType(PoleType poleType) {
        this.poleType = poleType;
    }
}
