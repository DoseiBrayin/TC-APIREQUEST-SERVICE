package com.example.ApiRest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table (name = "client")
public class client {
    @Id
    private String idclient;

    @Column(unique = true)
    private String email;

    private String dir;

    private String full_name;

    public client() {
    }

    public client(String idclient, String email, String dir, String full_name) {
        this.idclient = idclient;
        this.email = email;
        this.dir = dir;
        this.full_name = full_name;
    }

    public String getIdclient() {
        return idclient;
    }

    public void setIdclient(String idclient) {
        this.idclient = idclient;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }
}
