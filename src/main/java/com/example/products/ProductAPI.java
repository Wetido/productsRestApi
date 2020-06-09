package com.example.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductAPI {

    private ProductManager productManager;

    @Autowired
    public ProductAPI(ProductManager productManager){

        this.productManager = productManager;
    }


    @GetMapping("/hello")
    public String HelloWorld(){

        return "helmno";
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){

        return productManager.getProducts();
    }

    @PostMapping("/addProduct")
    public boolean addProduct(@RequestBody Product product){

        return productManager.addProduct(product);
    }

}
