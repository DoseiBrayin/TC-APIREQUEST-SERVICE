package com.example.ApiRest.controllers;

import com.example.ApiRest.models.client;
import com.example.ApiRest.services.client_service;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class client_controller {
    @Autowired
    private client_service client_service;

    @GetMapping ("/all")
    private ResponseEntity<List<client>> getAllClients(){
        return  ResponseEntity.ok(client_service.findAll());
    }

    @GetMapping
    private ResponseEntity<Optional<client>> getByID(){
        return  ResponseEntity.ok(client_service.findById("4377653"));
    }

}
