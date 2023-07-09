package com.zahid.OnlineShoppingSystem.service;

import com.zahid.OnlineShoppingSystem.dao.ProductRepository;
import com.zahid.OnlineShoppingSystem.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public void deleteProduct(Integer productId) {
        productRepository.deleteById(productId);
    }

    public Product getProductById(Integer id) {
       return productRepository.findById(id).orElse(null);
    }
}

