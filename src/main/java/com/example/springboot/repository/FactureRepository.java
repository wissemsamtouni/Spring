package com.example.springboot.repository;

import com.example.springboot.models.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
