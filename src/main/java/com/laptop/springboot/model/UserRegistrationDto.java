package com.laptop.springboot.model;

public class UserRegistrationDto {

	
	private String name;
	
	private String number;
	
	private String email;
	
	private String address;
	
	private String password;
	
	public UserRegistrationDto(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserRegistrationDto(String name, String number, String email, String address, String password) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.address = address;
		this.password = password;
	}
	
	
}
