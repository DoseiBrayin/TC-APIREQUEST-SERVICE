package com.example.ApiRest.repsositories;

import com.example.ApiRest.models.client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;


public interface client_repository extends JpaRepository<client,String>{

}
