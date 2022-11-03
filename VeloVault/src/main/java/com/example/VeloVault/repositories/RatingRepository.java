package com.example.VeloVault.repositories;

import com.example.VeloVault.models.RatingsCollection;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<RatingsCollection, Long> {

}
