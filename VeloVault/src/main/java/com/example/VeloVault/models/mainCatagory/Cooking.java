package com.example.VeloVault.models.mainCatagory;


import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.User;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.List;

@Entity
public abstract class Cooking extends Item {

    @Column(name = "weight")
    private int weight;

    public Cooking(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight) {
        super(name, brand, ratings, comments, user);
        this.weight = weight;
    }

    public Cooking() {
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
