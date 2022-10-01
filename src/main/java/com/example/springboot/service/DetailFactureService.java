package com.example.springboot.service;

import com.example.springboot.models.CategorieProduit;
import com.example.springboot.models.DetailFacture;
import com.example.springboot.repository.CategorieProduitRepository;
import com.example.springboot.repository.DetailFactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class DetailFactureService implements Idetailfacture {





    @Autowired
    private DetailFactureRepository detailfacturerepo ;

    @Override
    public List<DetailFacture> retrieveAllDetailFacture() {
        DetailFacture df = DetailFacture.builder().idDetailFacture(3L).build();

        return detailfacturerepo.findAll();
    }

    @Override
    public DetailFacture addDetailFacture(DetailFacture df) {
        return detailfacturerepo.save(df);
    }

    @Override
    public void deleteDetailFacture(Long id) {
        detailfacturerepo.deleteById(id);

    }

    @Override
    public DetailFacture updateDetailFacture(DetailFacture df) {
        return detailfacturerepo.save(df);
    }

    @Override
    public DetailFacture retrieveDetailFacture(Long id) {

        return detailfacturerepo.findById(id).orElse(null);
    }
}
