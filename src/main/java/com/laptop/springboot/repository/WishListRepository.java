package com.laptop.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.laptop.springboot.model.WishList;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Integer> {

	//finding data from db using user email
	List<WishList> findByUserEmail(String userEmail);
	
	
	//Deleting query with user email and product id
	@Query("DELETE FROM WishList c WHERE c.product.id = ?1 AND c.userEmail = ?2")
	@Modifying
	public void deleteByUserEmailAndProductId(String id, String userEmail);

}
