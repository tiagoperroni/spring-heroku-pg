package com.tiagoperroni.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tiagoperroni.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
