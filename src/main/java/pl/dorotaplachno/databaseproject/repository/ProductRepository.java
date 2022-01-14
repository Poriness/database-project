package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.dorotaplachno.databaseproject.entity.ProductEntity;

import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Short> {

    @Query(value = "Select * from Products LIMIT 10 ", nativeQuery = true)
    List<ProductEntity> getProducts();

}
