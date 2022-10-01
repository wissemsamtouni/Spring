package com.example.springboot.service;

import com.example.springboot.models.CategorieProduit;
import com.example.springboot.repository.CategorieProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategorieProduitService implements Icategorieproduit{

    @Autowired
    private CategorieProduitRepository categorieproduitrepo ;
    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {

        CategorieProduit cp = CategorieProduit.builder().idCategorie(3L).build();
        return categorieproduitrepo.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {

        return categorieproduitrepo.save(cp);
    }


    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {

        return categorieproduitrepo.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {

        return categorieproduitrepo.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {
        categorieproduitrepo.deleteById(id);
    }
}
