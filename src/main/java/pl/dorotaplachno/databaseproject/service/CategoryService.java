package pl.dorotaplachno.databaseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dorotaplachno.databaseproject.entity.CategoryEntity;
import pl.dorotaplachno.databaseproject.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;


    public List<CategoryEntity> getCategories() {
        return categoryRepository.findAll();
    }
}
