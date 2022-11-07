package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.SeasonType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Camping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class SleepingMat extends Camping {

    @Column(name = "thickness")
    private int thickness;

    @Column(name = "packSize")
    private String packSize;

    @Column(name = "season_type")
    @Enumerated(value = EnumType.STRING)
    private SeasonType seasonType;

    public SleepingMat(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, int thickness, String packSize, SeasonType seasonType, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, weight, category, subCategory);
        this.thickness = thickness;
        this.packSize = packSize;
        this.seasonType = seasonType;
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

    public SeasonType getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType = seasonType;
    }
}
