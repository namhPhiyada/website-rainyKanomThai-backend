package com.example.demo.controller;

import com.example.demo.model.Member;
import com.example.demo.service.Memberservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
@RequestMapping("/Member")
public class MemberController {
    @Autowired
    private Memberservice service;

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping
    public List<Member> getAllProducts() {
        logger.info("getAllProducts()");
        List<Member> Member = service.getAllMember();

        // Log the products list
        logger.info("Fetched Member: " + Member);

        return Member;
    }

}
