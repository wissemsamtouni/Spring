package com.example.springboot.repository;

import com.example.springboot.models.DetailFournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur, Long> {
}
