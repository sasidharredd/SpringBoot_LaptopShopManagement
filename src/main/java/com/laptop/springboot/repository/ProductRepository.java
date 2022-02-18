package com.laptop.springboot.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.laptop.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	//finding data from db using product id
	public Optional<Product> findById(String productId);

	//finding data from db using style category
	public List<Product> findAllByStyle(String style);

	//finding data from db using brand category
	public List<Product> findAllByBrand(String brand);

}
