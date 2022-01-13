package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import pl.dorotaplachno.databaseproject.entity.ProductEntity;
import pl.dorotaplachno.databaseproject.entity.SupplierEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public interface ProductRepository extends CrudRepository<ProductEntity, Short> {


//    @Query("Select e from Employee e WHERE e.name like CONCAT(:firstLetter,'%')")
//    List<ProductEntity> findByFirstLetter(@Param("firstLetter") String letter);

    @Query(value = "Select * from Products LIMIT 10 ", nativeQuery = true)
    List<ProductEntity> getProducts();

}
