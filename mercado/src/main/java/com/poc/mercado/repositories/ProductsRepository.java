package com.poc.mercado.repositories;

import com.poc.mercado.entities.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository  extends JpaRepository<Products, Long> {
}
