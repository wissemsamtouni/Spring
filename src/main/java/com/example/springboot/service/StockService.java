package com.example.springboot.service;

import com.example.springboot.models.Stock;
import com.example.springboot.repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class StockService implements Istock{
    @Autowired
    private StockRepository stockrepo;

    @Override
    public List<Stock> retrieveAllStocks() {
        Stock st = Stock.builder().idStock(3L).build();
        return stockrepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {

        return stockrepo.save(s);
    }

    @Override
    public void deleteStock(Long id) {
        stockrepo.deleteById(id);
    }

    @Override
    public Stock updateStock(Stock s) {

        return stockrepo.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {

        return stockrepo.findById(id).orElse(null);
    }
}
