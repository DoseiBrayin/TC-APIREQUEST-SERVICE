package com.example.ApiRest.repsositories;

import com.example.ApiRest.models.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface client_repository extends JpaRepository<client,String>{
    @Query(value = "select c1_0.idclient,c1_0.client_email,c1_0.direction,c1_0.full_name from client c1_0 where c1_0.direction = :direction",
    nativeQuery = true)
    List<client> findByAddress(@Param("direction") String address);
}
