package com.hardsoftday.foodchines.model;

public class AsiaFood {

    String name;
    String price;
    Integer imagenUrl;
    String rating;
    String restorantName;

    public AsiaFood(String name, String price, Integer imagenUrl, String rating, String restorantName) {
        this.name = name;
        this.price = price;
        this.imagenUrl = imagenUrl;
        this.rating = rating;
        this.restorantName = restorantName;
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

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRestorantName() {
        return restorantName;
    }

    public void setRestorantName(String restorantName) {
        this.restorantName = restorantName;
    }
}
