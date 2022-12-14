package com.example.VeloVault.controllers;

import com.example.VeloVault.models.Category;
import com.example.VeloVault.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping(value = "/categories")
    public List<Category> getAllCategories(){return categoryRepository.findAll();}

    @PostMapping(value = "/categories")
    public ResponseEntity postCategory(@RequestBody Category category){
        categoryRepository.save(category);
        return new ResponseEntity<>(category, HttpStatus.CREATED);
    }

    @GetMapping(value = "/categories/{id}")
    public ResponseEntity getCategory(@PathVariable Long id){
        return new ResponseEntity<>(categoryRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/categories/{id}")
    public ResponseEntity deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
        return new ResponseEntity(id, HttpStatus.OK);
    }
}
