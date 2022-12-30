package com.example.ApiRest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "type_service")
public class type_service {
    @Id
    private String idtype_service;
    private String service_type;
    private service service;
}
