package com.example.VeloVault.models.mainCatagory;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public abstract class Clothing extends Item {

    @Column(name = "size")
    private String size;

    public Clothing(String name, String brand, List<Integer> ratings, List<String> comments, User user, String size) {
        super(name, brand, ratings, comments, user);
        this.size = size;
    }

    public Clothing() {
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
