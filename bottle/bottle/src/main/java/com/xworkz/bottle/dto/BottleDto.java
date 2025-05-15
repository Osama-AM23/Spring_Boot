package com.xworkz.bottle.dto;

import lombok.Data;

@Data
public class BottleDto {

    private Integer id;
    private String brand;

    private double bottleQuantity;

    private double price;

    public Integer getId() {
        return id;
    }


    @Override
    public String toString() {
        return "BottleDto{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", bottleQuantity=" + bottleQuantity +
                ", price=" + price +
                '}';
    }

    public void setId(Integer id) {
        this.id = id;
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
