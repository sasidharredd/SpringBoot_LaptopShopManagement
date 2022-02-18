package com.laptop.springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laptop.springboot.model.Product;
import com.laptop.springboot.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	
    public List<Product> getAllProducts() {
	    List<Product> gamings  = new ArrayList<>();
	    productRepository.findAll().forEach(gamings::add);
	    return gamings;
    }

	public Optional<Product> findById(String id) {;
		return productRepository.findById(id);
	}
	
	public List<Product> getAllProductsByStyle(String style) {
	    List<Product> styles  = new ArrayList<>();
	    productRepository.findAllByStyle(style).forEach(styles::add);
	    return styles;
    }

	public List<Product> getAllProductsByBrand(String brand) {
		List<Product> brands = new ArrayList<>();
		productRepository.findAllByBrand(brand).forEach(brands::add);
	    return brands;
	}

}
