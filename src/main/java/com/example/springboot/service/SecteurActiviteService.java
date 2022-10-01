package com.example.springboot.service;

import com.example.springboot.models.Fournisseur;
import com.example.springboot.models.SecteurActivite;
import com.example.springboot.repository.FournisseurRepository;
import com.example.springboot.repository.SecteurActiviteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class SecteurActiviteService implements Isecteuractivite{
   @Autowired
    SecteurActiviteRepository secteurActiviteRepo;
   @Autowired
   FournisseurRepository fournisseurRepo;

    @Override
    public List<SecteurActivite> retrieveAllActivites() {
        SecteurActivite sac = SecteurActivite.builder().idSecteurActivite(3L).build();
        return secteurActiviteRepo.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepo.save(sa);
    }



    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepo.save(sa);
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secteurActiviteRepo.findById(id).orElse(null);
    }

    @Override
    public void removeSecteurActivite(Long id) {
        secteurActiviteRepo.deleteById(id);

    }



}
