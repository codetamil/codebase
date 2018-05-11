package com;

public class Menu {
	
	int id;
	
	String items;
	String categories;
	double price;
	int quantity;
	public  Menu(int id, String items, String categories, double price,
			int quantity) {
		
		this.id = id;
		this.items = items;
		this.categories = categories;
		this.price = price;
		this.quantity = quantity;
	}
	
	public int getId() {
		return id;
	}
	public String getItems() {
		return items;
	}
	public String getCategories() {
		return categories;
	}
	public double getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	
	
	

}
