package com.example.mongodb.repository;

import com.example.mongodb.document.Category;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
