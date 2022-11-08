package com.example.VeloVault.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @JsonIgnoreProperties({"category", "subCategory"})
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Item> items;

    @JsonIgnoreProperties({"category"})
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<SubCategory> subCategories;

    public Category(String categoryName, List<Item> items, List<SubCategory> subCategories) {
        this.categoryName = categoryName;
        if (items == null) {
            this.items = new ArrayList<>();
        } else {
            this.items = items;
        }

        if(subCategories ==  null ){
            this.subCategories = new ArrayList<>();
        } else {
            this.subCategories = subCategories;
        }
    }

    public Category() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<SubCategory> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}
