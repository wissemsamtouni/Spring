package com.example.springboot.service;

import com.example.springboot.models.Reglement;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ReglementService implements Ireglement{

    @Override
    public List<Reglement> retrieveAllReglement() {
        return null;
    }

    @Override
    public void deleteReglement(Long id) {

    }

    @Override
    public Reglement retrieveReglement(Long id) {
        return null;
    }

    @Override
    public Reglement updateReglement(Reglement r) {
        return null;
    }

    @Override
    public Reglement addReglement(Reglement r) {
        return null;
    }
}
