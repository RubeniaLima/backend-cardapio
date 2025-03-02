package com.rubenialima.cardapio.repository;

import com.rubenialima.cardapio.food.Food;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Id > {
}
