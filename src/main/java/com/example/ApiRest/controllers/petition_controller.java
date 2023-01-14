package com.example.ApiRest.controllers;

import com.example.ApiRest.models.client;
import com.example.ApiRest.models.petition;
import com.example.ApiRest.services.petition_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping ("/petition")
public class petition_controller {
    @Autowired
    private petition_service petition_service;

    @GetMapping("/all")
    private ResponseEntity<List<petition>> getAllPetition(){
       return (petition_service.findAll().isEmpty()) ? ResponseEntity.notFound().build() : ResponseEntity.ok(petition_service.findAll());
    }

    @GetMapping ("/id")
    private ResponseEntity<petition> getByID(@RequestParam String id){
        Optional<petition> Response = petition_service.findById(id);
        return Response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

}
