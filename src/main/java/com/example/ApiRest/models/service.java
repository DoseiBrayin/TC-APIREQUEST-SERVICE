package com.example.ApiRest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "service")
public class service {
    @Id
    private String idservice;
    private String name_service;

    private  client client;
}
