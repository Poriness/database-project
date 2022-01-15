package edu.agh.northwind.databaseproject.repository;

import edu.agh.northwind.databaseproject.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Short> {
    List<CategoryEntity> findAll();
}
