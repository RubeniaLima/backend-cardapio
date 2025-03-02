package com.rubenialima.cardapio.controller;

import com.rubenialima.cardapio.food.Food;
import com.rubenialima.cardapio.food.FoodRequestDTO;
import com.rubenialima.cardapio.food.FoodResponseDTO;
import com.rubenialima.cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodRepository repository;

    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){

    }

    @GetMapping
    public List<FoodResponseDTO> getAll(){

        List<FoodResponseDTO> foodList= repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
