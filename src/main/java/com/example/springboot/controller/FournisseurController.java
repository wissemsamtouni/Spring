package com.example.springboot.controller;

import com.example.springboot.models.Fournisseur;
import com.example.springboot.service.Ifournisseur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Fournisseur")
public class FournisseurController {

@Autowired
    Ifournisseur fournisseurinter;
@GetMapping("/afficherAllFournisseur")
    List<Fournisseur> afficherAllFournisseur(){

    return fournisseurinter.retrieveAllFournisseur();
}
@GetMapping ("/afficherFournisseur/{id}")
    public Fournisseur afficherFournisseur(@PathVariable ("id") Long idFournisseur){
    return fournisseurinter.retrieveFournisseur(idFournisseur);
}
@PostMapping("/ajouterFournisseur")
    public Fournisseur ajouterFournisseur(@RequestBody Fournisseur fr){
    return fournisseurinter.addFournisseur(fr);
}
@PutMapping("/modifierFournisseur")
public Fournisseur modifierFournisseur(@RequestBody Fournisseur fr) {
    return fournisseurinter.updateFournisseur(fr);
}
@DeleteMapping("/supprimerFournisseur/{id}")
    void supprimerFournisseur(@PathVariable ("id") Long idFournisseur){
    fournisseurinter.deleteFournisseur(idFournisseur);

}
@PutMapping("/assignFournisseurToSecteur/{id1}/{id2}")
    void assignFournisseurToSecteur(@PathVariable ("id1") Long idFournisseur,@PathVariable("id2") Long idSecteurActivite){
    fournisseurinter.assignFournisseurToSecteur(idFournisseur,idSecteurActivite);
}
}
