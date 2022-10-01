package com.example.springboot.controller;

import com.example.springboot.models.CategorieProduit;
import com.example.springboot.service.CategorieProduitService;
import com.example.springboot.service.Icategorieproduit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("CategorieProduit")

public class CategorieProduitController {
    @Autowired
    Icategorieproduit categorieproduitinter;
    @GetMapping("/afficherAllCategorie")
    List<CategorieProduit> afficherAllCategorie(){
        return categorieproduitinter.retrieveAllCategorieProduits();
    }
    @PostMapping("/ajouterCategorie")
    CategorieProduit ajouterCategorie(@RequestBody CategorieProduit catproduit){
        return categorieproduitinter.addCategorieProduit(catproduit);

    }
    @PutMapping("/modifierCategorie")
    CategorieProduit modifierCategorie(@RequestBody CategorieProduit categoriproduit){
        return categorieproduitinter.updateCategorieProduit(categoriproduit);
    }
    @DeleteMapping("/supprimerCategorie/{id}")
    void supprimerCategorie(@PathVariable("id") Long idCategorie){
        categorieproduitinter.removeCategorieProduit(idCategorie);
    }
    @GetMapping("/afficherCategorie/{id}")
   CategorieProduit afficherProduit(@PathVariable("id") Long idCategorie){
        return categorieproduitinter.retrieveCategorieProduit(idCategorie);
    }

}
