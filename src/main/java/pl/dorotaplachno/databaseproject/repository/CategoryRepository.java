package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.dorotaplachno.databaseproject.entity.CategoryEntity;

import java.util.List;

public interface CategoryRepository extends CrudRepository<CategoryEntity, Short> {
    List<CategoryEntity> findAll();
}
