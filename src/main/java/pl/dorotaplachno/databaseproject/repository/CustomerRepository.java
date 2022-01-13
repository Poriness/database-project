package pl.dorotaplachno.databaseproject.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.dorotaplachno.databaseproject.entity.CustomerEntity;

@Repository
public interface CustomerRepository extends CrudRepository<CustomerEntity, String>{
//all CRUD operations implemented in parent

}
