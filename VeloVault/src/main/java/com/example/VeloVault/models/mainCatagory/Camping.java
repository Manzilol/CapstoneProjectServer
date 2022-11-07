package com.example.VeloVault.models.mainCatagory;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.models.Item;
import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.models.User;

import javax.persistence.*;
import java.util.List;

@Entity
//@Table(name = "campingItems")
public abstract class Camping extends Item {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;

    @Column(name = "weight")
    private int weight;

    public Camping(String name, String brand, List<Integer> ratings, List<String> comments, User user, int weight, Category category, SubCategory subCategory) {
        super(name, brand, ratings, comments, user, category, subCategory);
        this.weight = weight;
    }

    public Camping() {
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
