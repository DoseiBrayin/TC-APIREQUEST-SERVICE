package com.example.ApiRest.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "client")
public class client {
    @Id
    private String id_client;

    @Column(unique = true)
    private String email;

    private String dir;

    private String full_name;


}
