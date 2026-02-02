package com.projetowebservice.course.repositories;

import com.projetowebservice.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
