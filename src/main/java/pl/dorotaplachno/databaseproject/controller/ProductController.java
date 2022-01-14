package pl.dorotaplachno.databaseproject.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pl.dorotaplachno.databaseproject.dto.ProductDto;
import pl.dorotaplachno.databaseproject.entity.ProductEntity;
import pl.dorotaplachno.databaseproject.service.ProductService;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products")
    public List<ProductEntity> getProducts() {
        return productService.getProducts();
    }

    @PostMapping("/products")
    public ResponseEntity<ProductEntity> addProduct(@RequestBody ProductDto product) {
        return ResponseEntity.ok(productService.addProduct(product));
    }
    
}
