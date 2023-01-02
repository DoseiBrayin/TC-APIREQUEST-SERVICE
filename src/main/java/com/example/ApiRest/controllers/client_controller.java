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

    @GetMapping ("/{id}")
    private ResponseEntity<client> getByID(@PathVariable String id){
        Optional<client> Response = client_service.findById(id);
        return Response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping ("/address")
    private ResponseEntity<List<client>> getByAddress(@RequestParam String address){
        System.out.println(address);
        List<client> items = client_service.findByAddress(address);
        if (items.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(items);
    }
    }

