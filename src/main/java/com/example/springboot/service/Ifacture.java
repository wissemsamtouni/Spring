package com.example.springboot.service;

import com.example.springboot.models.Facture;

import java.util.List;

public interface Ifacture {
    List<Facture> retrieveAllFacture();
    void cancelFacture(Long id) ;
    Facture retrieveFacture (Long id);

    Facture addFacture (Facture f);

    void deleteFacture (Long id);

    Facture updateFacture (Facture f);


}
