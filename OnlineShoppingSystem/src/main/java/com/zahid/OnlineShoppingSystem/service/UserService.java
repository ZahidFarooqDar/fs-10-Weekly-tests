package com.zahid.OnlineShoppingSystem.service;

import com.zahid.OnlineShoppingSystem.dao.UserRepository;
import com.zahid.OnlineShoppingSystem.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public void deleteUser(Integer userId) {
        userRepository.deleteById(userId);
    }
}

