package com.laptop.springboot.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.laptop.springboot.model.CartItem;
import com.laptop.springboot.model.Orders;
import com.laptop.springboot.model.Product;
import com.laptop.springboot.model.User;
import com.laptop.springboot.model.WishList;
import com.laptop.springboot.service.ProductService;
import com.laptop.springboot.service.ShoppingCartService;
import com.laptop.springboot.service.UserService;

@Controller
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;

    private final ProductService productService;
    
    private final UserService userService;
    
    

    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService, ProductService productService, UserService userService) {
        this.shoppingCartService = shoppingCartService;
        this.productService = productService;
		this.userService = userService;
    }

    
    String email;
    User user;
    
    @GetMapping("/")
    @ResponseBody
    public ModelAndView currentUserName(Authentication authentication) {
        email = authentication.getName();
        user = userService.getUserDetails(email);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Home");
        return modelAndView;
    }

    public String getUserEmail() {
    	return email;
    }
    
    //Adding product into cart
    @GetMapping("/shoppingCart/addProduct/{id}")
    public String addProductToCart(@PathVariable("id") String id) {
    	productService.findById(id).ifPresent(shoppingCartService::addProduct);
    	return "redirect:/showCart";
    }

    //Displaying cart items
    @GetMapping("/showCart") 
	 public ModelAndView getAllProducts(Model model) {	
    	List<CartItem> products = shoppingCartService.getProductsInCart(email);
    	if(products.isEmpty()) {
    		ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("EmptyCart");
            return modelAndView;
    	}
    	else {
    		List<Product> p1 = new ArrayList<>();
        	double total= 0.0;
        	for(int i=0;i<products.size();i++) {
        		p1.add(products.get(i).getProduct());
        		total+=products.get(i).getProduct().getPrice();
        	}
        	model.addAttribute("products", p1);
        	model.addAttribute("total", total);
        	ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("shoppingCart");
            return modelAndView;
    	}
	 }
    
    //Removing cart items
    @GetMapping("/shoppingCart/removeProduct/{productId}")
    public String removeProductFromCart(@PathVariable("productId") String productId) {
    	System.out.println("Inside remove in controller");
    	productService.findById(productId).ifPresent(shoppingCartService::removeProduct);
    	return "redirect:/showCart";
    }
    
    
    
    
   
    
    //Adding product into wish list
    @GetMapping("/shoppingCart/addProduct/wishlist/{id}")
    public String addProductToWishList(@PathVariable("id") String id) {
    	productService.findById(id).ifPresent(shoppingCartService::addProductToWishList);
    	return "redirect:/showWishList";
    }
    
    
    //Displaying wish list items
    @GetMapping("/showWishList")
	 public ModelAndView getAllProductsFromWishList(Model model) {	
    	List<WishList> products =  shoppingCartService.getProductsInWishList(email);
    	if(products.isEmpty()) {
    		ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("EmptyWishList");
            return modelAndView;
    	}
    	else {
    		List<Product> p1 = new ArrayList<>();
        	for(int i=0;i<products.size();i++) {
        		p1.add(products.get(i).getProduct());
        	}
        	model.addAttribute("products", p1);
        	ModelAndView modelAndView = new ModelAndView();
            modelAndView.setViewName("WishList");
            return modelAndView;
    	}
	 }
    
    //Removing cart items
    @GetMapping("/shoppingCart/removeProduct/wishList/{productId}")
    public String removeProductFromWishList(@PathVariable("productId") String productId) {
    	productService.findById(productId).ifPresent(shoppingCartService::removeProductFromWishList);
    	return "redirect:/showWishList";
    }

    
	@GetMapping("/payment")
	public ModelAndView paymentDetails(Model model) {
		List<CartItem> products =  shoppingCartService.getProductsInCart(email);
    	double total= 0.0;
    	for(int i=0;i<products.size();i++) {
    		total+=products.get(i).getProduct().getPrice();
    	}
    	model.addAttribute("total", total);
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("payment");
        System.out.println(modelAndView);
        return modelAndView;
	}
	
	
	
	@GetMapping("/cart/checkout")
	public ModelAndView finalizeCategoriesPage(Model model) {
		List<CartItem> products = shoppingCartService.getProductsInCart(email);
    	for(int i=0;i<products.size();i++) {
    		Product p =products.get(i).getProduct();
    		shoppingCartService.addProductToOrders(p);
    	}
    	shoppingCartService.removeAllProductsInCart(email);
    	List<Product> p1 = new ArrayList<>();
    	double total= 0.0;
    	for(int i=0;i<products.size();i++) {
    		p1.add(products.get(i).getProduct());
    		total+=products.get(i).getProduct().getPrice();
    	}
    	model.addAttribute("total", total);
    	model.addAttribute("products", p1);
		model.addAttribute("user", user);
    	ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("Checkout");
        System.out.println(modelAndView);
        return modelAndView;
	}
	
	
	
	
	@GetMapping("/showOrdersList")
	public ModelAndView getAllProductsFromOrders(Model model) {	
		List<Orders> products =  shoppingCartService.getProductsInOrders(email);
		List<Product> p1 = new ArrayList<>();
		for(int i=0;i<products.size();i++) {
			p1.add(products.get(i).getProduct());
		}
		model.addAttribute("products", p1);
		ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("orders");
        return modelAndView;
	 }
    
}
