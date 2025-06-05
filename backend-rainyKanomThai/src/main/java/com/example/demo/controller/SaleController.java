package com.example.demo.controller;

import com.example.demo.model.Sales;
import com.example.demo.service.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/sales")
public class SaleController {

    private static final Logger logger = LoggerFactory.getLogger(SaleController.class);

    @Autowired
    private SaleService saleService;

    @PostMapping
    public Sales insertSale(@RequestBody Sales sale) {
        logger.info("Received sale data: {}", sale); // log ข้อมูลที่รับมา
        Sales savedSale = saleService.insertSale(sale);
        logger.info("Saved sale data: {}", savedSale); // log ข้อมูลที่บันทึก
        return savedSale;
    }
}
