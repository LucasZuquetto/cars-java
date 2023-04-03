package com.example.postapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.postapi.models.Cars;

public interface CarsRepository extends JpaRepository<Cars, Long> {
    
}
