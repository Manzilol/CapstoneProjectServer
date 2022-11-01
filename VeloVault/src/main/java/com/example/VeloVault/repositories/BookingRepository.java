package com.example.VeloVault.repositories;

import com.example.VeloVault.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
