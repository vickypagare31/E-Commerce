package com.E_Commerce.E_CommerceApp.repository;

import com.E_Commerce.E_CommerceApp.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
