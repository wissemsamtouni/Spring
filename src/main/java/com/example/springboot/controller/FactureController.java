package com.example.springboot.controller;

import com.example.springboot.models.Facture;
import com.example.springboot.service.Ifacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Facture")
public class FactureController {
    @Autowired
    Ifacture factureinter;
    @GetMapping("/afficherAllFacture")
    List<Facture> afficherAllFacture(){
        return factureinter.retrieveAllFacture();

    }
    @PostMapping("/ajouterFacture")
    Facture ajouterFacture(@RequestBody Facture fact){
        return factureinter.addFacture(fact);
    }

    @PostMapping("/modifierFacture")
    Facture modifierFacture(@RequestBody Facture factt){
        return factureinter.updateFacture(factt);
    }
    @DeleteMapping("/supprimerFacture/{id}")
    void supprimerFacture(@PathVariable ("id") Long idFacture){
        factureinter.deleteFacture(idFacture);
    }
    @GetMapping("aficherFacture/{id}")
    Facture afficherFacture(@PathVariable("id") Long idFacture){
        return factureinter.retrieveFacture(idFacture);
    }
    @PutMapping("/cancelFacture/{id}")
    void cancelFacture(@PathVariable("id") Long id){
        factureinter.cancelFacture(id);


    }


}
