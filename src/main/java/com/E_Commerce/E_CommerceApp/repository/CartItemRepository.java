package com.E_Commerce.E_CommerceApp.repository;

import com.E_Commerce.E_CommerceApp.entity.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Long> {

}
