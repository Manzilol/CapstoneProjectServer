package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Clothing;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Insulated extends Clothing {

    @Column(name = "insulationType")
    private String insulationType;

    public Insulated(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, String insulationType, Category category) {
        super(name, brand, ratings, comments, user, size, category);
        this.insulationType = insulationType;
    }

    public Insulated() {
    }

    public String getInsulationType() {
        return insulationType;
    }

    public void setInsulationType(String insulationType) {
        this.insulationType = insulationType;
    }
}
