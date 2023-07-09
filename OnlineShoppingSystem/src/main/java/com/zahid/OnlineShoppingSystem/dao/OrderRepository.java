package com.zahid.OnlineShoppingSystem.dao;
import com.zahid.OnlineShoppingSystem.model.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    Optional<OrderEntity> findByIdAndUserId(Integer id, Integer userId);
    List<OrderEntity> findByUserId(Integer userId);
}



