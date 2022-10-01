package com.example.springboot.controller;

import com.example.springboot.models.SecteurActivite;
import com.example.springboot.service.Isecteuractivite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("SecteurActivite")

public class SecteurActiviteController {
    @Autowired
    Isecteuractivite secteurinter;
    @GetMapping("/afficherAllSecteur")
    List<SecteurActivite> afficherAllSecteurs(){
        return secteurinter.retrieveAllActivites();
    }
    @PostMapping("/ajouterSecteurActivite")
    SecteurActivite ajouterSecteurActivite(@RequestBody SecteurActivite sa){
        return secteurinter.addSecteurActivite(sa);
    }
    @PostMapping ("/modifier")
    SecteurActivite modofierSecteurActivite(@RequestBody SecteurActivite sa){
        return secteurinter.updateSecteurActivite(sa);
    }
    @GetMapping("/afficherSecteur/{id}")
    SecteurActivite affichersecteur(@PathVariable ("id") Long idSecteurActivite){
        return secteurinter.retrieveSecteurActivite(idSecteurActivite);
    }
    @DeleteMapping("/supprimerSecteur/{id}")
    void supprimerSecteur(@PathVariable ("id") Long idSecteurActivite){
        secteurinter.removeSecteurActivite(idSecteurActivite);
    }

}
