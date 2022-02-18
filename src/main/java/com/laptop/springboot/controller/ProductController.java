package com.laptop.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.laptop.springboot.model.Product;
import com.laptop.springboot.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	 
	 @GetMapping("/categories/{style}")
	 public ModelAndView getAllProducts1(Model model,@PathVariable("style") String style) {				
		List<Product> products =  productService.getAllProductsByStyle(style);
		System.out.println("Model before : "+model);
		model.addAttribute("products", products);
		System.out.println("Model after : "+model);
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Product");
	    return modelAndView;
	 }
	 
	 @GetMapping("/categories/brand/{brand}")
	 public ModelAndView getAllProductBrand(Model model,@PathVariable("brand") String brand) {				
		List<Product> products =  productService.getAllProductsByBrand(brand);
		System.out.println("Model before : "+model);
		model.addAttribute("products", products);
		System.out.println("Model after : "+model);
		ModelAndView modelAndView = new ModelAndView();
	    modelAndView.setViewName("Product");
	    return modelAndView;
	 }
}
