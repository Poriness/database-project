package edu.agh.northwind.databaseproject.controller;

import edu.agh.northwind.databaseproject.entity.CategoryEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.agh.northwind.databaseproject.service.CategoryService;

import java.util.List;

@RestController
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }


    @GetMapping("/category")
    public List<CategoryEntity> getCategories() {
        return categoryService.getCategories();
    }
    
}
