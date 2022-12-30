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

    public petition() {
    }

    public petition(String idpetition, String description, String state, Date create_stamp, String plataform, com.example.ApiRest.models.client client) {
        this.idpetition = idpetition;
        this.description = description;
        this.state = state;
        this.create_stamp = create_stamp;
        this.plataform = plataform;
        this.client = client;
    }

    public String getIdpetition() {
        return idpetition;
    }

    public void setIdpetition(String idpetition) {
        this.idpetition = idpetition;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreate_stamp() {
        return create_stamp;
    }

    public void setCreate_stamp(Date create_stamp) {
        this.create_stamp = create_stamp;
    }

    public String getPlataform() {
        return plataform;
    }

    public void setPlataform(String plataform) {
        this.plataform = plataform;
    }

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }


}
