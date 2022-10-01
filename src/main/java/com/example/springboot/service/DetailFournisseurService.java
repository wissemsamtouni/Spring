package com.example.springboot.service;

import com.example.springboot.models.DetailFacture;
import com.example.springboot.models.DetailFournisseur;
import com.example.springboot.repository.DetailFactureRepository;
import com.example.springboot.repository.DetailFournisseurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DetailFournisseurService implements Idetailfournisseur{
    @Autowired
    private DetailFournisseurRepository  detailfournisseurepo ;


    @Override
    public List<DetailFournisseur> retrieveAllDetailFournisseur() {
        DetailFournisseur dfo = DetailFournisseur.builder().idDetailFournisseur(3L).build();
        return detailfournisseurepo.findAll();
    }

    @Override
    public DetailFournisseur addDetailFournisseur(DetailFournisseur dfo) {

        return detailfournisseurepo.save(dfo);
    }

    @Override
    public void deleteDetailFournisseur(Long id) {
        detailfournisseurepo.deleteById(id);

    }

    @Override
    public DetailFournisseur updateDetailFournisseur(DetailFournisseur dfo) {
        return detailfournisseurepo.save(dfo);
    }

    @Override
    public DetailFournisseur retrieveDetailFournisseur(Long id) {
        return detailfournisseurepo.findById(id).orElse(null);
    }
}
