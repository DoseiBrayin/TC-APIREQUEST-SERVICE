package com.example.ApiRest.models;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "petition")
public class petition {
    @Id
    private String idpetition;
    private String description;
    private String state;
    private Date create_stamp;
    private String plataform;

    @ManyToOne
    @JoinColumn(name = "client_idclient")
    private client client;

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }


}
