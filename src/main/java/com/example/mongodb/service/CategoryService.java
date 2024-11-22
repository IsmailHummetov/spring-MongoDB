package com.example.mongodb.service;

import com.example.mongodb.document.Category;
import com.example.mongodb.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public String save(Category category) {
        return repository.save(category).getId();
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(String id) {
        return repository.findById(id).orElse(null);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }
}
