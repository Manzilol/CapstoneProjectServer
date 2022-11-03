package com.example.VeloVault.repositories;

import com.example.VeloVault.models.CommentsCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<CommentsCollection, Long> {
}
