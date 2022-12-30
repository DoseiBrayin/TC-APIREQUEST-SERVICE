package com.example.ApiRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "service")
public class service {
    @Id
    private String idservice;
    private String name_service;

    @ManyToOne
    @JoinColumn(name = "client_id_client")
    private  client client;

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }
}
