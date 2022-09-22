package com.testcorpora.controller;

import com.testcorpora.dto.UserDto;
import com.testcorpora.repos.UserContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserContactRepo userRepo;

    @GetMapping("/user")
    public ResponseEntity<List<UserDto>> getAllUser(){

        return ResponseEntity.ok(userRepo.getAllUser());

    }

    @GetMapping("/hello")
    public String hello(){

        return "hahahah";

    }



}
