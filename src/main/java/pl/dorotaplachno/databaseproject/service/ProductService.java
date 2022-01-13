package pl.dorotaplachno.databaseproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
}
