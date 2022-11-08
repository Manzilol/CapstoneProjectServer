package com.example.VeloVault.controllers;

import com.example.VeloVault.models.Item;
import com.example.VeloVault.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ItemController {

    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public List<Item> getAllItems(){ return itemRepository.findAll();}

    @PostMapping(value = "/items")
    public ResponseEntity<Item> postItem(@RequestBody Item item){
        itemRepository.save(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

    @GetMapping(value = "/items/{id}")
    public ResponseEntity getItem(@PathVariable Long id){
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/items/{id}")
    public ResponseEntity deleteItem(@PathVariable Long id){
        itemRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }


}
