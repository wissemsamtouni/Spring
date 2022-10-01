package com.example.springboot.service;

import com.example.springboot.models.DetailFournisseur;

import java.util.List;

public interface Idetailfournisseur {
    List<DetailFournisseur> retrieveAllDetailFournisseur();

    DetailFournisseur addDetailFournisseur (DetailFournisseur df);

    void deleteDetailFournisseur (Long id);

    DetailFournisseur updateDetailFournisseur (DetailFournisseur df);

    DetailFournisseur retrieveDetailFournisseur (Long id);

}
