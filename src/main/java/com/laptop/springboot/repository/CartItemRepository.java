package com.laptop.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.springboot.model.CartItem;

@Repository
public interface CartItemRepository extends JpaRepository<CartItem, Integer> {

	//finding data from db using user email
	List<CartItem> findByUserEmail(String userEmail);

	//Deleting query with user email and product id
	@Query("DELETE FROM CartItem c WHERE c.product.id = ?1 AND c.userEmail = ?2")
	@Modifying
	public void deleteByUserEmailAndProductId(String id, String userEmail);

	void deleteAllByUserEmail(String email);

}
