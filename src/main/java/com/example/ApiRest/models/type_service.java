package com.example.ApiRest.models;

import jakarta.persistence.*;

@Entity
@Table(name = "type_service")
public class type_service {
    @Id
    private String idtype_service;
    private String service_type;
    @ManyToOne
    @JoinColumn(name = "service_idservice")
    private service service;

    public com.example.ApiRest.models.service getService() {
        return service;
    }

    public void setService(com.example.ApiRest.models.service service) {
        this.service = service;
    }
}
