package com.example.VeloVault.repositories;

import com.example.VeloVault.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
