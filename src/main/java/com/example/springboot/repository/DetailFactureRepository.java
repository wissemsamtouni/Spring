package com.example.springboot.repository;

import com.example.springboot.models.DetailFacture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailFactureRepository extends JpaRepository<DetailFacture, Long> {
}
