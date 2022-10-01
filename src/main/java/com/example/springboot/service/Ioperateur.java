package com.example.springboot.service;

import com.example.springboot.models.Operateur;

import java.util.List;

public interface Ioperateur {
    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur(Operateur o);

    Operateur updateOperateur(Operateur o);

    Operateur retrieveOperateur(Long id);

    void removeOperateur(Long id);
}