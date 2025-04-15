package com.learning.controller;

import com.learning.model.GroceryItem;
import com.learning.model.Note;
import com.learning.service.KnoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/notes")
public class KnoteController {

    @Autowired
    KnoteService knoteService;
    @GetMapping("/")
    public List<GroceryItem> getAllNotes(){
        return knoteService.getAllItems();
    }

    @PostMapping("/save")
    public void saveNote(GroceryItem groceryItem){
        knoteService.saveItem(groceryItem);
    }
}
