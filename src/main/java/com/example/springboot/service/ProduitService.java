package com.example.springboot.service;

import com.example.springboot.models.CategorieProduit;
import com.example.springboot.models.Facture;
import com.example.springboot.models.Produit;
import com.example.springboot.models.Stock;
import com.example.springboot.repository.CategorieProduitRepository;
import com.example.springboot.repository.ProduitRepository;
import com.example.springboot.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class ProduitService implements Iproduit{
    @Autowired
    private ProduitRepository produitrepo;
    @Autowired
    private CategorieProduitRepository categorieproduitrepo;
    @Autowired
    private StockRepository stockRepo;
    @Override
    public List<Produit> retrieveAllProduit() {
        Produit pr = Produit.builder().idProduit(3L).build();
        return produitrepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {

        CategorieProduit cat = categorieproduitrepo.findById(idCategorieProduit).orElse(null);
        Stock stk = stockRepo.findById(idStock).orElse(null);;
        p.setCategorieProduit(cat);
        p.setStock(stk);

        return produitrepo.save(p);
    }


    @Override
    public void deleteProduit(Long id) {

    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit ct = categorieproduitrepo.findById(idCategorieProduit).orElse(null);
        Stock sk = stockRepo.findById(idStock).orElse(null);;
        p.setCategorieProduit(ct);
        p.setStock(sk);

        return produitrepo.save(p);
    }



    @Override
    public Produit retrieveProduit(Long id) {

        return produitrepo.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        Produit pr = retrieveProduit(idProduit);
        Stock stk = stockRepo.findById(idStock).orElse(null);


        pr.setStock(stk);
        produitrepo.save(pr);

    }

}
