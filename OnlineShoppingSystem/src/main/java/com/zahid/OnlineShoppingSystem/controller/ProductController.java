package com.zahid.OnlineShoppingSystem.controller;

import com.zahid.OnlineShoppingSystem.model.Product;
import com.zahid.OnlineShoppingSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping(params = "category")
    public List<Product> getProductsByCategory(@RequestParam String category) {
        return productService.getProductsByCategory(category);
    }

    @DeleteMapping("/{productId}")
    public void deleteProduct(@PathVariable Integer productId) {
        productService.deleteProduct(productId);
    }
}

