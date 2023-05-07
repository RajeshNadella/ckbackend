package com.cloudkitchen.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudkitchen.entities.FoodDetails;

public interface FoodDetailsRepo extends JpaRepository<FoodDetails, Integer> {

}
