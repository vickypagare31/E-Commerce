package com.E_Commerce.E_CommerceApp.service;

import com.E_Commerce.E_CommerceApp.entity.Cart;
import com.E_Commerce.E_CommerceApp.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    public Cart saveCart(Cart cart)
    {
        return cartRepository.save(cart);
    }

    public List<Cart>getAllCart()
    {
        return cartRepository.findAll();
    }
}
