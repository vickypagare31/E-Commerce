package com.E_Commerce.E_CommerceApp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cartItems")
public class CartItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cart_Id")
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_Id")
    private Product product;

    @Column(nullable = false)
    private Integer quantity;

    
}
