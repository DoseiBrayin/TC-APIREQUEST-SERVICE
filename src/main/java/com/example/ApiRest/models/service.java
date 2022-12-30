package com.example.ApiRest.models;

import jakarta.persistence.Id;

public class service {
    @Id
    private String idservice;
    private String name_service;

    private  client client;
}
