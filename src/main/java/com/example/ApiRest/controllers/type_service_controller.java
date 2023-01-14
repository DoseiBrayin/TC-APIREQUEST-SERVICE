package com.example.ApiRest.controllers;

import com.example.ApiRest.models.type_service;
import com.example.ApiRest.services.type_service_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/type_service")
public class type_service_controller {
    @Autowired
    private type_service_service type_service_service;

    @GetMapping("/")
    private ResponseEntity<List<type_service>> getAllType(){
        if(type_service_service.findAll().isEmpty()) return ResponseEntity.notFound().build();
        return  ResponseEntity.ok(type_service_service.findAll());
    }
}
