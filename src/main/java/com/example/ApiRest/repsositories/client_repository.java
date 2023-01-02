package com.example.ApiRest.repsositories;

import com.example.ApiRest.models.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface client_repository extends JpaRepository<client,String>{
    @Query(value = "select c1_0.idclient,c1_0.client_email,c1_0.direction,c1_0.full_name " +
            "from client c1_0 " +
            "where c1_0.direction = :direction or c1_0.idclient = :id or c1_0.full_name = :name, c1_0.client_email = :email",
            nativeQuery = true)
    List<client> findClient(@Param("direction") String address, @Param("id") String id, @Param("name") String name,@Param("email") String email);

}
