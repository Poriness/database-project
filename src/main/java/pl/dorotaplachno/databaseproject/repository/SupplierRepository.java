package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.repository.CrudRepository;
import pl.dorotaplachno.databaseproject.entity.CategoryEntity;
import pl.dorotaplachno.databaseproject.entity.SupplierEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public interface SupplierRepository extends CrudRepository<SupplierEntity, Short> {

}
