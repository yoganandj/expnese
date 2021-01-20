package com.react.expenses.expense.controller;

import com.react.expenses.expense.model.Category;
import com.react.expenses.expense.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://react-aws-first-s31.s3-website.us-east-2.amazonaws.com")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping("/categories")
    Collection<Category> getCategories(){
        return categoryRepository.findAll();

    }

    @GetMapping("/category/{id}")
    ResponseEntity<?> getCategory(@PathVariable Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.map(response -> ResponseEntity.ok().body(response)).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/category")
    ResponseEntity<Category> saveCategory(@Validated @RequestBody Category category) throws URISyntaxException {
        Category result = categoryRepository.save(category);
        return ResponseEntity.created(new URI("/api/category/"+result.getId())).body(result);

    }

    @PutMapping("/category/{id}")
    ResponseEntity<Category> updateCategory(@Validated @RequestBody Category category) {
        Category result = categoryRepository.save(category);
        return ResponseEntity.ok().body(result);

    }

    @DeleteMapping("/category/{id}")
    ResponseEntity<?> deleteCategory(@PathVariable Long id){
        categoryRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }


}
