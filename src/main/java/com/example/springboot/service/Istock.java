package com.example.springboot.service;

import com.example.springboot.models.Stock;

import java.util.List;

public interface Istock {
    List<Stock> retrieveAllStocks();

    Stock addStock (Stock s);

    void deleteStock (Long id);

    Stock updateStock (Stock s);

    Stock retrieveStock (Long id);
}
