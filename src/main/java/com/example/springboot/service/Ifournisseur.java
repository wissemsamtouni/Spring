package com.example.springboot.service;

import com.example.springboot.models.Fournisseur;

import java.util.List;

public interface Ifournisseur {
    List<Fournisseur> retrieveAllFournisseur();
    Fournisseur addFournisseur (Fournisseur f);

    void deleteFournisseur (Long id);

    Fournisseur updateFournisseur (Fournisseur f);

    Fournisseur retrieveFournisseur (Long id);

    void assignFournisseurToSecteur(Long fournisseurId, Long secteurActiviteId);
}
