package com.example.springboot.service;

import com.example.springboot.models.CategorieProduit;

import java.util.List;

public interface Icategorieproduit {
    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit (CategorieProduit cp);



    CategorieProduit updateCategorieProduit (CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit (Long id);


    void removeCategorieProduit (Long id);
}
