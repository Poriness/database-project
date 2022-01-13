package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dorotaplachno.databaseproject.entity.OrderEntity;

@Repository
public interface OrderRepository extends CrudRepository<OrderEntity, Short>{
//all CRUD operations implemented in parent

}
