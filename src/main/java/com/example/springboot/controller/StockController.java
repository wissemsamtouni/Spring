package com.example.springboot.controller;

import com.example.springboot.models.Stock;
import com.example.springboot.service.Istock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Stock")
public class StockController {
    @Autowired
    Istock stockinter;
    @GetMapping("/afficherAllStok")
    List<Stock> afficherAllStock(){
        return stockinter.retrieveAllStocks();
    }
    @PostMapping("/ajouterStock")
    Stock ajouterStock(@RequestBody Stock stk){
        return stockinter.addStock(stk);
    }
    @PostMapping("/modifierStock")
    Stock modifierStock(@RequestBody Stock stk) {
        return stockinter.updateStock(stk);
    }
    @DeleteMapping("/supprimerStock/{id}")
    void supprimerStock(@PathVariable ("id") Long idStock){
        stockinter.deleteStock(idStock);
    }
    @GetMapping("/afficherStock/{id}")
    Stock afficherStock(@PathVariable ("id") Long idStock){
        return stockinter.retrieveStock(idStock);
    }

}
