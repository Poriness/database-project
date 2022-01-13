package pl.dorotaplachno.databaseproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.dorotaplachno.databaseproject.entity.CategoryEntity;
import pl.dorotaplachno.databaseproject.service.CategoryService;

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
