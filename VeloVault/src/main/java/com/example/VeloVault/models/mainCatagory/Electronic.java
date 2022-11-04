package com.example.VeloVault.models.mainCatagory;



import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public abstract class Electronic extends Item {

    @Column(name = "rechargeable")
    private boolean rechargeable;

    public Electronic(String name, String brand, List<Integer> ratings, List<String> comments, User user, boolean rechargeable, Category category) {
        super(name, brand, ratings, comments, user, category);
        this.rechargeable = rechargeable;
    }

    public Electronic() {
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
