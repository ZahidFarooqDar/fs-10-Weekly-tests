package com.zahid.OnlineShoppingSystem.controller;

import com.zahid.OnlineShoppingSystem.model.Address;
import com.zahid.OnlineShoppingSystem.model.OrderEntity;
import com.zahid.OnlineShoppingSystem.model.Product;
import com.zahid.OnlineShoppingSystem.model.User;
import com.zahid.OnlineShoppingSystem.service.AddressService;
import com.zahid.OnlineShoppingSystem.service.OrderService;
import com.zahid.OnlineShoppingSystem.service.ProductService;
import com.zahid.OnlineShoppingSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/orders")
public class OrderController {
    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;
    @Autowired
    AddressService addressService;
    @PostMapping
    public OrderEntity createOrder(@RequestBody OrderEntity orderEntity) {
        // Get user, product, and address by their respective IDs
        User user = userService.getUserById(orderEntity.getUser().getId());
        Product product = productService.getProductById(orderEntity.getProduct().getId());
        Address address = addressService.getAddressById(orderEntity.getAddress().getId());

        if (user != null && product != null && address != null) {
            orderEntity.setUser(user);
            orderEntity.setProduct(product);
            orderEntity.setAddress(address);
            return (OrderEntity) orderService.createOrder(orderEntity);
        } else {
            throw new IllegalArgumentException("Invalid user, product, or address ID.");
        }
    }

    @GetMapping("/{orderId}")
    public OrderEntity getOrderById(@PathVariable Integer orderId) {
        return (OrderEntity) orderService.getOrderById(orderId);
    }

    @GetMapping("/user/{userId}")
    public List<OrderEntity> getOrdersByUserId(@PathVariable Integer userId) {
        return orderService.getOrdersByUserId(userId);
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable Integer orderId) {
        orderService.deleteOrder(orderId);
    }
}

