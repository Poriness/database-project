package pl.dorotaplachno.databaseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dorotaplachno.databaseproject.dto.ProductDto;
import pl.dorotaplachno.databaseproject.entity.ProductEntity;
import pl.dorotaplachno.databaseproject.repository.ProductRepository;

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
