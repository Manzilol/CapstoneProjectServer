package com.example.VeloVault.repositories;

import com.example.VeloVault.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
