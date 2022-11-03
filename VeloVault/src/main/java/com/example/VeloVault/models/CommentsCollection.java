package com.example.VeloVault.models;

import com.example.VeloVault.models.Item;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "comments")
public class CommentsCollection {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "comment")
    private String comment;

    @ManyToOne
    @JsonIgnoreProperties({"comments"})
    @JoinColumn(name = "itemId", nullable = false)
    private Item item;

    public CommentsCollection(String comment, Item item) {
        this.comment = comment;
        this.item = item;
    }

    public CommentsCollection() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
