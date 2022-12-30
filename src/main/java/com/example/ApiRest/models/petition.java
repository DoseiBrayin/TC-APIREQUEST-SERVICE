package com.example.ApiRest.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    private client client;

}
