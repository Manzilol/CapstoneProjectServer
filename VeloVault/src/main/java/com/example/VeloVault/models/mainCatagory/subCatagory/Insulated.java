package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.InsulationType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Clothing;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class Insulated extends Clothing {

    @Column(name = "insulationType")
    @Enumerated(value = EnumType.STRING)
    private InsulationType insulationType;

    public Insulated(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, InsulationType insulationType, Category category) {
        super(name, brand, ratings, comments, user, size, category);
        this.insulationType = insulationType;
    }

    public Insulated() {
    }

    public InsulationType getInsulationType() {
        return insulationType;
    }

    public void setInsulationType(InsulationType insulationType) {
        this.insulationType = insulationType;
    }
}
