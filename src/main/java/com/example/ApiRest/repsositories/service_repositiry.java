package com.example.ApiRest.repsositories;

import com.example.ApiRest.models.service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface service_repositiry extends JpaRepository<service,String> {
    @Query(value = "select s from service s where s.client.idclient = :client")
    Optional<service> findByClient(@Param("client") String client);
}
