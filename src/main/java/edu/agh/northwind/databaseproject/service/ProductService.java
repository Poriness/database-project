package edu.agh.northwind.databaseproject.service;

import edu.agh.northwind.databaseproject.dto.ProductDto;
import edu.agh.northwind.databaseproject.entity.ProductEntity;
import edu.agh.northwind.databaseproject.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;


    public List<ProductEntity> getProducts() {
        return productRepository.getProducts();
    }
    public ProductEntity addProduct(ProductDto product) {
        ProductEntity p = new ProductEntity(
                product.getProductId(),
                product.getProductName(),
                product.getQuantityPerUnit(),
                product.getUnitPrice(),
                product.getUnitsInStock(),
                product.getUnitsOnOrder(),
                product.getReorderLevel(),
                product.getDiscontinued()
        );
        return productRepository.save(p);
    }

}
