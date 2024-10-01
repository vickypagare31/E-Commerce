package com.E_Commerce.E_CommerceApp.repository;

import com.E_Commerce.E_CommerceApp.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

}
