package com.example.demo.service;

import com.example.demo.model.Member;
import com.example.demo.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class Memberservice {
    @Autowired
    private MemberRepository repository;

    public List<Member> getAllMember() {
        return repository.findAll();
    }
}
