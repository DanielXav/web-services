package com.example.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservices.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
