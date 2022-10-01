package com.example.springboot.controller;


import com.example.springboot.models.Operateur;
import com.example.springboot.service.Ioperateur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Operateur")
public class OperateurController {
    @Autowired
    Ioperateur operateurinter;

    @GetMapping("/afficherAllOperateur")
    List<Operateur> afficherAllOperateur() {
        return operateurinter.retrieveAllOperateurs();
    }

    @PostMapping("/ajouterOperateur")
    public Operateur ajouterOperateur(@RequestBody Operateur p) {
        return operateurinter.addOperateur(p);
    }

    @PostMapping("/modifierOperateur")
    public Operateur modifierOperateur(@RequestBody Operateur op) {
        return operateurinter.updateOperateur(op);
    }

    @GetMapping("/afficherOperateur/{id}")
    public Operateur afficherOperateur(@PathVariable("id") Long idOperateur) {
        return operateurinter.retrieveOperateur(idOperateur);
    }
    @DeleteMapping
    void supprimerOperateur(@PathVariable Long idOperateur){
        operateurinter.removeOperateur(idOperateur);
    }
}
