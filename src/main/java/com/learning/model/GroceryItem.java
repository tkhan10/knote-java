package com.learning.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "GroceryItem")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GroceryItem {
    @Id
    private String id;
    @Field(name="name")
    private String name;
    @Field(name="quantity")
    private int quantity;
    @Field(name="category")
    private String category;
}
