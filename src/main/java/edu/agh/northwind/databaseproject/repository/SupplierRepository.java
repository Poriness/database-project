package edu.agh.northwind.databaseproject.repository;

import edu.agh.northwind.databaseproject.entity.SupplierEntity;
import org.springframework.data.repository.CrudRepository;

public interface SupplierRepository extends CrudRepository<SupplierEntity, Short> {

}
