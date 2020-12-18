package com.hardsoftday.foodchines.model;

public class PopularFood {

    String name;
    String price;
    Integer imagenUrl;

    public PopularFood(String name, String price, Integer imagenUrl) {
        this.name = name;
        this.price = price;
        this.imagenUrl = imagenUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Integer getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(Integer imagenUrl) {
        this.imagenUrl = imagenUrl;
    }
}
