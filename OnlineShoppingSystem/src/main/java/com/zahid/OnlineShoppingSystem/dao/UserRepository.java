package com.zahid.OnlineShoppingSystem.dao;

import com.zahid.OnlineShoppingSystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}

