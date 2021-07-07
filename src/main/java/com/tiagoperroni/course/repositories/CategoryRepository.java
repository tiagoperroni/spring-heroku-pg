package com.tiagoperroni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
