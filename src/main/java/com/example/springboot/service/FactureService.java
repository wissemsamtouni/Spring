package com.example.springboot.service;

import com.example.springboot.models.Facture;
import com.example.springboot.repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class FactureService implements Ifacture{


    @Autowired
    private FactureRepository facturerepo;
    @Override
    public List<Facture> retrieveAllFacture() {
        Facture fa = Facture.builder().idFacture(3L).build();
        return facturerepo.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        Facture aa = retrieveFacture(id);
        aa.setArchivee(false);
        facturerepo.save(aa);


    }

    @Override
    public Facture addFacture(Facture fa) {
        return facturerepo.save(fa);
    }

    @Override
    public void deleteFacture(Long id) {
        facturerepo.deleteById(id);

    }

    @Override
    public Facture updateFacture(Facture fa) {

        return facturerepo.save(fa);
    }

    @Override
    public Facture retrieveFacture(Long id) {

        return facturerepo.findById(id).orElse(null);
    }
}
