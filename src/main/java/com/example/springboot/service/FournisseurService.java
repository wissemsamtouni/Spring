package com.example.springboot.service;

import com.example.springboot.models.Fournisseur;
import com.example.springboot.models.SecteurActivite;
import com.example.springboot.repository.FournisseurRepository;
import com.example.springboot.repository.SecteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FournisseurService implements Ifournisseur{
    @Autowired
    private FournisseurRepository fournisseurrepo;
    @Autowired
    private SecteurActiviteRepository secteurrepo;
    @Override
    public List<Fournisseur> retrieveAllFournisseur() {
        Fournisseur four = Fournisseur.builder().idFournisseur(3L).build();
        return fournisseurrepo.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurrepo.save(f);
    }

    @Override
    public void deleteFournisseur(Long id) {
        fournisseurrepo.deleteById(id);

    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurrepo.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurrepo.findById(id).orElse(null);
    }

    @Override
    public void assignFournisseurToSecteur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fr = fournisseurrepo.findById(fournisseurId).orElse(null);
        SecteurActivite sa = secteurrepo.findById(secteurActiviteId).orElse(null);
        fr.getSecteurActivites().add(sa);
        fournisseurrepo.save(fr);
    }

}
