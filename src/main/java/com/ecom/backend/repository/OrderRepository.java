package com.ecom.backend.repository;

import com.ecom.backend.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
    List<Order> findByCustomerEmailOrderByOrderDateDesc(String customerEmail);
    List<Order> findAllByOrderByOrderDateDesc();
}