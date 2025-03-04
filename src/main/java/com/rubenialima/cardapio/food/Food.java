package com.rubenialima.cardapio.food;

import jakarta.persistence.*;
import lombok.*;


@Table(name = "foods")
@Entity(name="foods")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String image;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price =data.price();
        this.title = data.title();
    }

    public Food(String title, Long id, String image, Integer price) {
        this.title = title;
        this.id = id;
        this.image = image;
        this.price = price;
    }

    public Food() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }
}
