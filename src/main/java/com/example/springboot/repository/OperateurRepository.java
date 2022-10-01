package com.example.springboot.repository;

import com.example.springboot.models.Operateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OperateurRepository extends JpaRepository<Operateur, Long> {
}
