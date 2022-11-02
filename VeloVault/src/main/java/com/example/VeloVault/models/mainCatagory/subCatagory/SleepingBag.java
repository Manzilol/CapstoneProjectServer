package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Camping;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class SleepingBag extends Camping {

    @Column(name = "insulationType")
    private String insulationType;

    @Column(name = "comfortRating")
    private int comfortRating;

    @Column(name = "season")
    private String season;

    @Column(name = "packSize")
    private String packSize;

    public SleepingBag(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, String insulationType, int comfortRating, String season, String packSize) {
        super(name, brand, ratings, comments, user, weight);
        this.insulationType = insulationType;
        this.comfortRating = comfortRating;
        this.season = season;
        this.packSize = packSize;
    }

    public SleepingBag() {
    }

    public String getInsulationType() {
        return insulationType;
    }

    public void setInsulationType(String insulationType) {
        this.insulationType = insulationType;
    }

    public int getComfortRating() {
        return comfortRating;
    }

    public void setComfortRating(int comfortRating) {
        this.comfortRating = comfortRating;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }
}
