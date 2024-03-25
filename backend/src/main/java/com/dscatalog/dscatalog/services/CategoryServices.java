package com.dscatalog.dscatalog.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dscatalog.dscatalog.entities.Category;
import com.dscatalog.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository repository;

    @Transactional (readOnly = true)
    public List<Category> findAll() {
        return repository.findAll();

    }
    
}
