package com.example.ApiRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class service {
    @Id
    private String idservices;
    private String name_service;

    @ManyToOne
    @JoinColumn(name = "client_idclient")
    private  client client;

    public service() {
    }

    public service(String idservices, String name_service, com.example.ApiRest.models.client client) {
        this.idservices = idservices;
        this.name_service = name_service;
        this.client = client;
    }

    public String getIdservices() {
        return idservices;
    }

    public void setIdservices(String idservices) {
        this.idservices = idservices;
    }

    public String getName_service() {
        return name_service;
    }

    public void setName_service(String name_service) {
        this.name_service = name_service;
    }

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }
}
