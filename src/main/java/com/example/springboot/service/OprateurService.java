package com.example.springboot.service;

import com.example.springboot.models.Operateur;
import com.example.springboot.repository.OperateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class OprateurService implements Ioperateur{
    @Autowired
    private OperateurRepository operaateurrepo;
    @Override
    public List<Operateur> retrieveAllOperateurs() {
        Operateur op = Operateur.builder().idperateur(3L).build();
        return operaateurrepo.findAll();
    }

    @Override
    public Operateur addOperateur(Operateur op) {
        return operaateurrepo.save(op);
    }


    @Override
    public Operateur updateOperateur(Operateur op) {
        return operaateurrepo.save(op);
    }

    @Override
    public Operateur retrieveOperateur(Long id) {
        return operaateurrepo.findById(id).orElse(null);
    }

    @Override
    public void removeOperateur(Long id) {
        operaateurrepo.deleteById(id);

    }
}
