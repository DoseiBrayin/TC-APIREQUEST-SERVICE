package com.example.ApiRest.controllers;

import com.example.ApiRest.models.client;
import com.example.ApiRest.services.client_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping ("/id")
    private ResponseEntity<client> getByID(@RequestParam String id){
        Optional<client> Response = client_service.findById(id);
        return Response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping ("/")
    private ResponseEntity<List<client>> getByAddress(@RequestParam String address,@RequestParam String id,@RequestParam String name,@RequestParam String email){
        if (client_service.findClient(address, id, name, email).isEmpty()) return ResponseEntity.notFound().build();
        return ResponseEntity.ok(client_service.findClient(address, id, name, email));
    }
    }

