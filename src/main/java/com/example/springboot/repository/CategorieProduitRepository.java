package com.example.springboot.repository;

import com.example.springboot.models.CategorieProduit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit, Long> {
}
