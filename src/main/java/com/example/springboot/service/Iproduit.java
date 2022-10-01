package com.example.springboot.service;

import com.example.springboot.models.Produit;

import java.util.List;

public interface Iproduit {
    List<Produit> retrieveAllProduit();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    void deleteProduit (Long id);

    Produit updateProduit (Produit p,Long idCategorieProduit, Long idStock);

    Produit retrieveProduit (Long id);

    void assignProduitToStock(Long idProduit, Long idStock);
}
