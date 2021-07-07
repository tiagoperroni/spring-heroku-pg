package com.tiagoperroni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
