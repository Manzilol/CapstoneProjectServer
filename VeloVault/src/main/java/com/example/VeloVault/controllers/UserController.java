package com.example.VeloVault.controllers;

import com.example.VeloVault.models.User;
import com.example.VeloVault.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public List<User> getAllUsers(){ return userRepository.findAll();}

    @PostMapping(value = "/users")
    public ResponseEntity postUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }
}
