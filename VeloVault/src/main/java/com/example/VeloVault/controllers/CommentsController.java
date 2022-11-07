package com.example.VeloVault.controllers;

import com.example.VeloVault.models.CommentsCollection;
import com.example.VeloVault.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentsController {

    @Autowired
    CommentRepository commentRepository;

    @GetMapping(value = "/comments")
    public List<CommentsCollection> getAllComments(){return commentRepository.findAll();}

    @PostMapping(value = "/comments")
    public ResponseEntity postComment(@RequestBody CommentsCollection commentsCollection){
        commentRepository.save(commentsCollection);
        return new ResponseEntity<>(commentsCollection, HttpStatus.CREATED);
    }

    @GetMapping(value = "/comments/{id}")
    public ResponseEntity getComment(@PathVariable Long id){
        return new ResponseEntity<>(commentRepository.findById(id), HttpStatus.OK);
    }

    @DeleteMapping(value = "/comments/{id}")
    public ResponseEntity deleteComment(@PathVariable Long id){
        commentRepository.deleteById(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }

}
