package com.example.products;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductManager {

    private List<Product> products;

    public ProductManager(){

        this.products = new ArrayList<>();
        products.add(new Product("Czipsy", 5,100,100));
        products.add(new Product("Platki owsiane", 10,1,30));
    }

    public boolean addProduct(Product product){
        return products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }
}
