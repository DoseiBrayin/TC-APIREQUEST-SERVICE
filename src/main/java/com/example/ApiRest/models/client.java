package com.example.ApiRest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Entity
@Table (name = "client",schema = "mydb")
public class client {
    @Id
    private String idclient;

    private String client_email;

    private String direction;

    private String full_name;

    public client() {
    }

    public client(String idclient, String client_email, String direction, String full_name) {
        this.idclient = idclient;
        this.client_email = client_email;
        this.direction = direction;
        this.full_name = full_name;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }

    public String getClient_email() {
        return client_email;
    }

    public void setClient_email(String client_email) {
        this.client_email = client_email;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
