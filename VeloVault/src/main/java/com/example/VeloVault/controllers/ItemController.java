package com.example.VeloVault.controllers;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public List<Item> getAllItems(){ return itemRepository.findAll();}

    @GetMapping(value = "items")
    public ResponseEntity postItem(@RequestBody Item item){
        itemRepository.save(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }
}
