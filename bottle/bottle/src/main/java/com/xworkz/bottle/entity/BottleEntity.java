package com.xworkz.bottle.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

@Entity
@Data
@Table(name = "bottle_details")

public class BottleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String brand;

    private double bottleQuantity;

    private double price;

    @Override
    public String toString() {
        return "BottleEntity{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", bottleQuantity=" + bottleQuantity +
                ", price=" + price +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public double getBottleQuantity() {
        return bottleQuantity;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setBottleQuantity(double bottleQuantity) {
        this.bottleQuantity = bottleQuantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
