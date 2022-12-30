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

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }
}
