package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Camping;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class SleepingMat extends Camping {

    @Column(name = "thickness")
    private int thickness;

    @Column(name = "packSize")
    private String packSize;

    @Column(name = "season")
    private String season;

    public SleepingMat(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int thickness, String packSize, String season, Category category) {
        super(name, brand, ratings, comments, user, weight, category);
        this.thickness = thickness;
        this.packSize = packSize;
        this.season = season;
    }

    public SleepingMat() {
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
}
