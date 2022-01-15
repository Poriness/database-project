package edu.agh.northwind.databaseproject.repository;

import edu.agh.northwind.databaseproject.entity.OrderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Short>{
//all CRUD operations implemented in parent

}
