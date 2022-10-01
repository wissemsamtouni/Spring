package com.example.springboot.service;

import com.example.springboot.models.Reglement;

import java.util.List;

public interface Ireglement {
    List<Reglement> retrieveAllReglement();

    Reglement addReglement (Reglement r);

    void deleteReglement (Long id);

    Reglement updateReglement (Reglement r);

    Reglement retrieveReglement (Long id);
}
