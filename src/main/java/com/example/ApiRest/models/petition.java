package com.example.ApiRest.models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "petition", schema = "mydb")
public class petition {

    @Id
    @Column(name = "idpettion", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @TableGenerator(name = "tab", initialValue = 0)
    private int idPetition;

    @Column(name = "description", nullable = false, length = 500)
    private String description;

    @Column(name = "state", nullable = false, length = 45)
    private String state;

    @Column(name = "create_time", nullable = false)
    @CreationTimestamp
    private Timestamp createTime;

    @Column(name = "plataform", nullable = false, length = 45)
    private String platform;

    @ManyToOne
    @JoinColumn(name = "client_idclient", referencedColumnName = "idclient", nullable = false)
    private client client;

    @ManyToOne
    @JoinColumn(name = "idcustomer", referencedColumnName = "username", nullable = false)
    private User customer;

    public int getIdPetition() {
        return idPetition;
    }

    public void setIdPetition(int idPetition) {
        this.idPetition = idPetition;
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

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public com.example.ApiRest.models.client getClient() {
        return client;
    }

    public void setClient(com.example.ApiRest.models.client client) {
        this.client = client;
    }

    public User getCustomer() {
        return customer;
    }

    public void setCustomer(User customer) {
        this.customer = customer;
    }
}
