package com.example.springboot.controller;

import com.example.springboot.models.Produit;
import com.example.springboot.service.Iproduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Produit")
public class ProduitController {

    @Autowired
    Iproduit produitinter;
    @PostMapping("/ajouterProduit/{id1}/{id2}")
    Produit ajouterProduit (@RequestBody Produit pr, @PathVariable ("id1") Long idCategorieProduit,@PathVariable ("id2") Long idStock){
        return produitinter.addProduit(pr,idCategorieProduit,idStock);

    }
    @GetMapping("/afficherAllProduit")
    List<Produit> afficherAllProduit(){
        return produitinter.retrieveAllProduit();
    }

    @GetMapping("/modifierProduit/{id1}/{id2}")
    Produit modifierProduit(@RequestBody Produit pr, @PathVariable ("id1") Long idCategorieProduit,@PathVariable ("id2") Long idStock){
        return produitinter.updateProduit(pr,idCategorieProduit,idStock);
    }

    @GetMapping("/afficherProduit/{id}")
    Produit afficherProduit(@PathVariable ("id") Long idProduit){
        return produitinter.retrieveProduit(idProduit);
    }
    @PutMapping("/assignProduitStock/{id1}/{id2}")
    void assignProduitToStock(@PathVariable ("id1") Long idProduit,@PathVariable("id2") Long idStock){
        produitinter.assignProduitToStock(idProduit,idStock);
    }

}
