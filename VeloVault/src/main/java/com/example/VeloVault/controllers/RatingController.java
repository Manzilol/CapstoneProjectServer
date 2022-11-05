package com.example.VeloVault.controllers;

import com.example.VeloVault.models.RatingsCollection;
import com.example.VeloVault.repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RatingController {

    @Autowired
    RatingRepository ratingRepository;

    @GetMapping(value = "/ratings")
    public List<RatingsCollection> getAllRatings(){return ratingRepository.findAll();}

    @PostMapping(value = "/ratings")
    public ResponseEntity postRating(@RequestBody RatingsCollection ratingsCollection){
        ratingRepository.save(ratingsCollection);
        return new ResponseEntity<>(ratingsCollection, HttpStatus.CREATED);
    }
}
