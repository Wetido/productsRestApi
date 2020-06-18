package com.example.products;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductAPI {

    //private ProductManager productManager;
    private ProductRepo productRepo;

    @Autowired
    public ProductAPI(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }

    @RequestMapping("/hello")
    public String HelloWorld(){

        return "page";
    }

    @GetMapping("/products")
    public Iterable<Product> getProducts(){

        return productRepo.findAll();
    }

    @PostMapping("/product")
    public Product addProduct(@RequestBody Product product){

        return productRepo.save(product);
    }

/*    @DeleteMapping("/product")
    public void deleteProduct(@RequestParam int index){
        productManager.deleteProduct(index);
    }*/

}
