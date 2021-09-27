package com.example.webservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webservices.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
