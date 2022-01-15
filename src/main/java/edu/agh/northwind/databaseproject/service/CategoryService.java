package edu.agh.northwind.databaseproject.service;

import edu.agh.northwind.databaseproject.entity.CategoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import edu.agh.northwind.databaseproject.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<CategoryEntity> getCategories() {
        return categoryRepository.findAll();
    }
}
