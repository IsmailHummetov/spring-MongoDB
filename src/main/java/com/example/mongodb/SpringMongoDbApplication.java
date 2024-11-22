package com.example.mongodb;

import com.example.mongodb.document.Product;
import com.example.mongodb.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringMongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMongoDbApplication.class, args);
    }

}
