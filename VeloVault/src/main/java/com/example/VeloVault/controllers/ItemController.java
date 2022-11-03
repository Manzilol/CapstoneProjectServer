package com.example.VeloVault.controllers;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public List<Item> getAllItems(){ return itemRepository.findAll();}


}
