package com.example.ApiRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "type_service")
public class type_service {
    @Id
    private String idtype_service;
    private String service_type;

    @ManyToOne
    @JoinColumn(name = "services_idservices")
    private service services;

    public service getServices() {
        return services;
    }

    public void setServices(service services) {
        this.services = services;
    }


}
