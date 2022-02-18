package com.laptop.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.laptop.springboot.model.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {

	//finding data from db using user email
	List<Orders> findByUserEmail(String userEmail);

}
