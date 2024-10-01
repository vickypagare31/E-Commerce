package com.E_Commerce.E_CommerceApp.controller;

import com.E_Commerce.E_CommerceApp.entity.Product;
import com.E_Commerce.E_CommerceApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping()
    public List<Product>getAlProducts()
    {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product>getProductsById(@PathVariable Long id)
    {
        Optional<Product>product=productService.getProductsById(id);
        return product.map(ResponseEntity::ok).orElseGet(()-> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping()
    public ResponseEntity<Product>saveProducts(@RequestBody Product product)
    {
        Product saveProduct=productService.saveProduct(product);
        return  new ResponseEntity<>(saveProduct, HttpStatus.CREATED);
    }
}
