package com.duong.casemodule6.repository;

import com.duong.casemodule6.entity.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IOrderRepository extends JpaRepository<Order,Long> {
}
