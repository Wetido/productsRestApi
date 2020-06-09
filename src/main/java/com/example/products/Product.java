package com.example.products;

public class Product {

    String name;
    int proteins;
    int fat;
    int carbo;

    public Product(){}

    public Product(String name, int proteins, int fat, int carbo) {
        this.name = name;
        this.proteins = proteins;
        this.fat = fat;
        this.carbo = carbo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProteins() {
        return proteins;
    }

    public void setProteins(int proteins) {
        this.proteins = proteins;
    }

    public int getFat() {
        return fat;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public int getCarbo() {
        return carbo;
    }

    public void setCarbo(int carbo) {
        this.carbo = carbo;
    }
}
