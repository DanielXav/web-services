package com.example.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservices.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
