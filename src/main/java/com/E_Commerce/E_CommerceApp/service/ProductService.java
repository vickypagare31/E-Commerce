package com.E_Commerce.E_CommerceApp.service;

import com.E_Commerce.E_CommerceApp.entity.Product;
import com.E_Commerce.E_CommerceApp.repository.ProductRepository;
import org.hibernate.validator.constraints.Normalized;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product)
    {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts()
    {
        return productRepository.findAll();
    }

    public Optional<Product>getProductsById(Long id)
    {
        return productRepository.findById(id);
    }
}
