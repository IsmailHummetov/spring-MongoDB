package com.example.mongodb.service;

import com.example.mongodb.document.Product;
import com.example.mongodb.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public String save(Product product){
        return repository.save(product).getId();
    }

    public Product findById(String id){
        return repository.findById(id).orElse(null);
    }

    public List<Product> findAll(){
        return repository.findAll();
    }

    public void delete(String id){
        repository.deleteById(id);
    }

}
