package com.example.mongodb.document;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Category {

    private String id;
    private String name;
}
