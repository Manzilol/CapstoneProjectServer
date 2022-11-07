package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.Enums.SuspensionType;
import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Bike;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.util.List;

@Entity
public class OffRoad extends Bike {

    @Column(name = "suspensionType")
    @Enumerated(value = EnumType.STRING)
    private SuspensionType suspensionType;

    public OffRoad(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size, SuspensionType suspensionType, Category category) {
        super(name, brand, ratings, comments, user, size, category);
        this.suspensionType = suspensionType;
    }

    public OffRoad() {
    }

    public SuspensionType getSuspensionType() {
        return suspensionType;
    }

    public void setSuspensionType(SuspensionType suspensionType) {
        this.suspensionType = suspensionType;
    }
}
