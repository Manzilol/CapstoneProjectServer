package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.InsulationType;
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
public class SleepingBag extends Camping {

    @Column(name = "insulationType")
    @Enumerated(value = EnumType.STRING)
    private InsulationType insulationType;

    @Column(name = "comfortRating")
    private int comfortRating;

    @Column(name = "season_type")
    @Enumerated(value = EnumType.STRING)
    private SeasonType seasonType;

    @Column(name = "packSize")
    private String packSize;

    public SleepingBag(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, InsulationType insulationType, int comfortRating, SeasonType seasonType, String packSize, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, weight, category, subCategory);
        this.insulationType = insulationType;
        this.comfortRating = comfortRating;
        this.seasonType = seasonType;
        this.packSize = packSize;
    }

    public SleepingBag() {
    }

    public InsulationType getInsulationType() {
        return insulationType;
    }

    public void setInsulationType(InsulationType insulationType) {
        this.insulationType = insulationType;
    }

    public int getComfortRating() {
        return comfortRating;
    }

    public void setComfortRating(int comfortRating) {
        this.comfortRating = comfortRating;
    }

    public SeasonType getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(SeasonType seasonType) {
        this.seasonType = seasonType;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }
}
