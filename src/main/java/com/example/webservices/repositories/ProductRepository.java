package com.example.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservices.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
