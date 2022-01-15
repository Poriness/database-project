package edu.agh.northwind.databaseproject;

import edu.agh.northwind.databaseproject.entity.CategoryEntity;
import edu.agh.northwind.databaseproject.entity.OrderEntity;
import edu.agh.northwind.databaseproject.entity.ProductEntity;
import edu.agh.northwind.databaseproject.entity.SupplierEntity;
import edu.agh.northwind.databaseproject.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import javax.annotation.PostConstruct;
import java.util.Optional;

@SpringBootApplication
public class DatabaseProjectApplication {


	public static void main(String[] args) {
		SpringApplication.run(DatabaseProjectApplication.class, args);
	}


	@Autowired private CustomerRepository customerRepository;
	@Autowired private OrderRepository orderRepository;
	@Autowired private CategoryRepository categoryRepository;
	@Autowired private SupplierRepository supplierRepository;
	@Autowired private ProductRepository productRepository;

	@PostConstruct
	public void init() {

//		CustomerEntity customerEntity = CustomerEntity.builder()
//				.customerId("DDPLA")
//				.companyName("Wedel")
//				.contactName("Dorota Plachno")
//				.contactTitle("Mrs.")
//				.address("Sezamkowa 12")
//				.city("Cracow")
//				.region("Voivodeship")
//				.country("Poland")
//				.phone("888888888")
//				.fax("")
//				.build();
//		customerRepository.save(customerEntity);
//
		Optional<OrderEntity> o = orderRepository.findById((short)10248);
		o.ifPresent(System.out::println);

		Optional<CategoryEntity> c = categoryRepository.findById((short)1);
		c.ifPresent(System.out::println);

		Optional<SupplierEntity> s = supplierRepository.findById((short)1);
		s.ifPresent(System.out::println);

		Optional<ProductEntity> p = productRepository.findById((short)1);
		p.ifPresent(System.out::println);
	}


}
