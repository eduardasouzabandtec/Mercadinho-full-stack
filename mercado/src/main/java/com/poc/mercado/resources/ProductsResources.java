package com.poc.mercado.resources;

import com.poc.mercado.entities.Products;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductsResources {
    @GetMapping
    public ResponseEntity<Products> findAll() {
        String morango = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3Q5WNSDNI8U24G0m0XxTJdOfQKy673hH7KmKG7cj69w&s";
        Products teste = new Products(null,"frutas",2,"morango", 20.00, morango);

        return ResponseEntity.ok().body(teste);
    }
}
