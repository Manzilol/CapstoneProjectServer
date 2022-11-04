package com.example.VeloVault.models.mainCatagory.subCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.User;
import com.example.VeloVault.models.mainCatagory.Electronic;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Navigation extends Electronic {

    public Navigation(String name, String brand, List<Integer> ratings, List<String> comments, User user, boolean rechargeable, Category category) {
        super(name, brand, ratings, comments, user, rechargeable, category);
    }

    public Navigation() {
    }


}
