package com.example.ApiRest.controllers;

import com.example.ApiRest.models.service;
import com.example.ApiRest.services.service_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/service")
public class service_controller {
    @Autowired
    private service_service service_service;

    @GetMapping ("/")
    private ResponseEntity<List<service>> getServices(){
        if(service_service.findAll().isEmpty()) return  ResponseEntity.notFound().build();
        return  ResponseEntity.ok(service_service.findAll());
    }
    @GetMapping ("/id")
    private ResponseEntity<service> getServicesByID(@RequestParam String id){
        Optional<service> Response = service_service.findById(id);
        return Response.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
    @GetMapping ("/client")
    private  ResponseEntity<service> getServicesByClient(@RequestParam String client){
        Optional<service> Response = service_service.findByClient(client);
        return  Response.map(ResponseEntity::ok).orElseGet(()-> ResponseEntity.notFound().build());
    }
}
