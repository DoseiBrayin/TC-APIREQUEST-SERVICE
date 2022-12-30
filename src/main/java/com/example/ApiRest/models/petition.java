package com.example.ApiRest.models;

import jakarta.persistence.Id;

import java.util.Date;

public class petition {
    @Id
    private String idpetition;
    private String description;
    private String state;
    private Date create_stamp;
    private String plataform;

    private client client;

}
