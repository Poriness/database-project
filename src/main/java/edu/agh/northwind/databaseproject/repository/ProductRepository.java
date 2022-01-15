package edu.agh.northwind.databaseproject.repository;

import edu.agh.northwind.databaseproject.entity.ProductEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Short> {

    @Query(value = "Select * from Products LIMIT 10 ", nativeQuery = true)
    List<ProductEntity> getProducts();

}
