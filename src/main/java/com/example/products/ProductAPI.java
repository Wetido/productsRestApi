package com.example.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/products")
    public List<Product> getProducts(){

        return productManager.getProducts();
    }

    @PostMapping("/product")
    public boolean addProduct(@RequestBody Product product){

        return productManager.addProduct(product);
    }

    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam int index){
        productManager.deleteProduct(index);
    }

}
