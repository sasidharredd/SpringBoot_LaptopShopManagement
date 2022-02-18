package com.laptop.springboot.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	
		@Id
	   private String id;
		private String imglink;
	   private String name;
	   private String descp;
	   private double price;
	   private String style;
	   private String brand;
	   
	   
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImglink() {
		return imglink;
	}
	public void setImglink(String imglink) {
		this.imglink = imglink;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescp() {
		return descp;
	}
	public void setDescp(String descp) {
		this.descp = descp;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Product(String id, String imglink, String name, String descp, double price, String style, String brand) {
		super();
		this.id = id;
		this.imglink = imglink;
		this.name = name;
		this.descp = descp;
		this.price = price;
		this.style = style;
		this.brand = brand;
	}
	public Product() {
		super();
	}   
}
