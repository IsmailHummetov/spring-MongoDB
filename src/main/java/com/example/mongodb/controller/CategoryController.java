package com.example.mongodb.controller;


import com.example.mongodb.document.Category;
import com.example.mongodb.service.CategoryService;
import com.example.mongodb.service.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping
    public ResponseEntity<String> save(@RequestBody Category Category) {
        return new ResponseEntity<>(categoryService.save(Category), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok(categoryService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") String id){
        return ResponseEntity.ok(categoryService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") String id){
        categoryService.delete(id);
        return ResponseEntity.accepted().build();
    }
}
