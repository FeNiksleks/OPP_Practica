package com.company;

public class Product {
    String name;
    int price;
    float rating;

    public Product() {
        this.name = "Unknown Product";
    }

    public Product setName(String name) {
        this.name = name;
        return this;
    }

    public Product setPrice(int price) {
        this.price = price;
        return this;
    }

    public Product setRating(float rating) {
        this.rating = rating;
        return this;
    }

}


