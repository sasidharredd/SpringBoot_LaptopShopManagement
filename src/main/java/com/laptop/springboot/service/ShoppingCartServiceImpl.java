package com.laptop.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import com.laptop.springboot.controller.ShoppingCartController;
import com.laptop.springboot.model.CartItem;
import com.laptop.springboot.model.Orders;
import com.laptop.springboot.model.Product;
import com.laptop.springboot.model.WishList;
import com.laptop.springboot.repository.CartItemRepository;
import com.laptop.springboot.repository.OrdersRepository;
import com.laptop.springboot.repository.WishListRepository;

import java.util.List;



@Service
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {


    @Autowired
    private ShoppingCartController controller;
    
    @Autowired 
    private CartItemRepository cartRepo;
    
    @Autowired 
    private WishListRepository listRepo;
    
    @Autowired 
    private OrdersRepository ordersRepo;

    @Override
    public void addProduct(Product product) {	
    	CartItem newItem = new CartItem();
    	newItem.setProduct(product);
    	newItem.setUser_email(controller.getUserEmail());
    	cartRepo.save(newItem);
    }

    @Override
    public void removeProduct(Product product) {
        cartRepo.deleteByUserEmailAndProductId(product.getId(),controller.getUserEmail());
    }
    
    @Override
    public List<CartItem> getProductsInCart(String email) {
        return cartRepo.findByUserEmail(email);
    }

 	@Override
	public void addProductToWishList(Product product) {
    	WishList newItem = new WishList();
    	newItem.setProduct(product);
    	newItem.setUser_email(controller.getUserEmail());
    	listRepo.save(newItem);
	}
	
	@Override
    public void removeProductFromWishList(Product product) {
        listRepo.deleteByUserEmailAndProductId(product.getId(),controller.getUserEmail());
    }
    

	@Override
	public List<WishList> getProductsInWishList(String email) {
		return listRepo.findByUserEmail(email);
	}

	@Override
	public List<Orders> getProductsInOrders(String email) {
		return ordersRepo.findByUserEmail(email);
	}
	
	@Override
	public void addProductToOrders(Product product) {
    	Orders newItem = new Orders();
        newItem.setProduct(product);
        newItem.setUser_email(controller.getUserEmail());
        ordersRepo.save(newItem);    	
	}

	@Override
	public void removeAllProductsInCart(String email) {
		cartRepo.deleteAllByUserEmail(email);
		
	}
}
