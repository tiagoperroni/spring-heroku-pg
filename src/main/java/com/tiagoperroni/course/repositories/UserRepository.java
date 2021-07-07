package com.tiagoperroni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
