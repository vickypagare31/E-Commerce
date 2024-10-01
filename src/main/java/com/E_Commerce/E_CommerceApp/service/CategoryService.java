package com.E_Commerce.E_CommerceApp.service;

import com.E_Commerce.E_CommerceApp.entity.Category;
import com.E_Commerce.E_CommerceApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;


    public Category saveCategory(Category category)
    {
        return categoryRepository.save(category);
    }

    public List<Category>getAllCategories()
    {
        return categoryRepository.findAll();
    }
}
