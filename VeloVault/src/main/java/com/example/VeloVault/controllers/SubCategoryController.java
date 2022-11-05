package com.example.VeloVault.controllers;

import com.example.VeloVault.models.SubCategory;
import com.example.VeloVault.repositories.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubCategoryController {

    @Autowired
    SubCategoryRepository subCategoryRepository;

    @GetMapping(value = "/subCategories")
    public List<SubCategory> getAllSubCategories(){return subCategoryRepository.findAll();}

    @PostMapping(value = "/subCategories")
    public ResponseEntity postSubCategory(@RequestBody SubCategory subCategory){
        subCategoryRepository.save(subCategory);
        return new ResponseEntity<>(subCategory, HttpStatus.CREATED);
    }
}
