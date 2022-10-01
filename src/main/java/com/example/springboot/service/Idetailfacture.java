package com.example.springboot.service;

import com.example.springboot.models.DetailFacture;

import java.util.List;

public interface Idetailfacture {
    List<DetailFacture> retrieveAllDetailFacture();

    DetailFacture addDetailFacture (DetailFacture df);

    void deleteDetailFacture (Long id);

    DetailFacture updateDetailFacture (DetailFacture df);

    DetailFacture retrieveDetailFacture (Long id);
}
