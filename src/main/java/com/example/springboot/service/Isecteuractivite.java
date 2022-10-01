package com.example.springboot.service;

import com.example.springboot.models.SecteurActivite;

import java.util.List;

public interface Isecteuractivite {
    List<SecteurActivite> retrieveAllActivites();

    SecteurActivite addSecteurActivite(SecteurActivite sa);


    SecteurActivite updateSecteurActivite(SecteurActivite sa);

    SecteurActivite retrieveSecteurActivite(Long id);

    void removeSecteurActivite(Long id);


}