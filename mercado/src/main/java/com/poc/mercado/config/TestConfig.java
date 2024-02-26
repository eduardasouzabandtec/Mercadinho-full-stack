package com.poc.mercado.config;

import com.poc.mercado.entities.Products;
import com.poc.mercado.repositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private ProductsRepository productsRepository;

    @Override
    public void run(String... args) throws Exception {
        String morango_url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3Q5WNSDNI8U24G0m0XxTJdOfQKy673hH7KmKG7cj69w&s";
        String banana_url = "https://www.cnnbrasil.com.br/wp-content/uploads/sites/12/2023/06/banana_fruta_getty.jpg?w=1200&h=900&crop=1";
        Products morango = new Products(null,"frutas",2,"morango", 20.00, morango_url );
        Products banana = new Products(null,"frutas",2,"banana", 05.00, banana_url );

        productsRepository.saveAll(Arrays.asList(morango, banana));
    }
}
