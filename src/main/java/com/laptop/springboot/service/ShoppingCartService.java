package com.laptop.springboot.service;



import java.util.List;

import org.springframework.stereotype.Service;

import com.laptop.springboot.model.CartItem;
import com.laptop.springboot.model.Orders;
import com.laptop.springboot.model.Product;
import com.laptop.springboot.model.WishList;

@Service
public interface ShoppingCartService {
	

    void removeProduct(Product product);

  	void addProduct(Product product);

	void removeProductFromWishList(Product product);

	void addProductToWishList(Product product);

	List<CartItem> getProductsInCart(String email);

	List<WishList> getProductsInWishList(String email);
	
	List<Orders> getProductsInOrders(String email);

	void addProductToOrders(Product product);

	void removeAllProductsInCart(String email);
	
	
}
