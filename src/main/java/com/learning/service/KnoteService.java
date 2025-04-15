package com.learning.service;

import com.learning.model.GroceryItem;
import com.learning.model.Note;
import com.learning.repository.GroceryItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class KnoteService {

    @Autowired
    GroceryItemRepository groceryItemRepository;
    public List<GroceryItem> getAllItems(){

        return groceryItemRepository.findAll();
    }

    public void saveItem(GroceryItem groceryItem){
        groceryItemRepository.save(groceryItem);
    }
}
