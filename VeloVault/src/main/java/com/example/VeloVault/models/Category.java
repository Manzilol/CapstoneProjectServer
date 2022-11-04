package com.example.VeloVault.models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name")
    private String categoryName;

    @JsonIgnoreProperties({"category"})
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private List<Item> itemId;


    public Category(String categoryName, List<Item> itemId) {
        this.categoryName = categoryName;
        this.itemId = itemId;
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

    public List<Item> getItemId() {
        return itemId;
    }

    public void setItemId(List<Item> itemId) {
        this.itemId = itemId;
    }
}
