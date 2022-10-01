package com.example.springboot.repository;

import com.example.springboot.models.Reglement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReglementRepository extends JpaRepository<Reglement, Long> {

}
