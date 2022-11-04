package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Camping;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class BivvyBag extends Camping {

    @Column(name = "packSize")
    private String packSize;

    @Column(name = "hooped")
    private boolean hooped;

    public BivvyBag(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, String packSize, boolean hooped, Category category) {
        super(name, brand, ratings, comments, user, weight, category);
        this.packSize = packSize;
        this.hooped = hooped;
    }

    public BivvyBag() {
    }

    public String getPackSize() {
        return packSize;
    }

    public void setPackSize(String packSize) {
        this.packSize = packSize;
    }

    public boolean isHooped() {
        return hooped;
    }

    public void setHooped(boolean hooped) {
        this.hooped = hooped;
    }
}
