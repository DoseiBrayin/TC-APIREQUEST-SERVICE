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

    public type_service() {
    }

    public type_service(String idtype_service, String service_type, service services) {
        this.idtype_service = idtype_service;
        this.service_type = service_type;
        this.services = services;
    }

    public String getIdtype_service() {
        return idtype_service;
    }

    public void setIdtype_service(String idtype_service) {
        this.idtype_service = idtype_service;
    }

    public service getServices() {
        return services;
    }

    public void setServices(service services) {
        this.services = services;
    }

    public String getService_type() {
        return service_type;
    }

    public void setService_type(String service_type) {
        this.service_type = service_type;
    }
}
