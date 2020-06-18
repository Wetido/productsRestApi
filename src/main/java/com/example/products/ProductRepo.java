package com.example.products;

import org.springframework.data.repository.CrudRepository;


public interface ProductRepo extends CrudRepository<Product, Long> {
}

