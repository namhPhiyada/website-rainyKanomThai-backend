package com.example.demo.service;

import com.example.demo.model.Sales;
import com.example.demo.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SaleService {
    @Autowired
    private SaleRepository repository;

    public Sales insertSale(Sales sale) {
        sale.setSaleDate(new Date());
        return repository.save(sale);
    }
}

