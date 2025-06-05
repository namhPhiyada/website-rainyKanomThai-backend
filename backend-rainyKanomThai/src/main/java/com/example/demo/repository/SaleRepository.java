package com.example.demo.repository;

import com.example.demo.model.Sales;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SaleRepository extends MongoRepository<Sales, String> {
}