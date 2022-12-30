package com.example.ApiRest.repsositories;

import com.example.ApiRest.models.petition;
import org.springframework.data.jpa.repository.JpaRepository;

public interface petition_repository extends JpaRepository<petition,String> {
}
