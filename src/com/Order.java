package com;

public class Order {
	int tableNo;
	Menu menu;
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public int getTableNo() {
		return tableNo;
	}
	public String getOrderItems() {
		return orderItems;
	}
	public int getQuantityItems() {
		return quantityItems;
	}
	public double getBill() {
		return bill;
	}
	String orderItems;
	int quantityItems;
	//payattentionagain
	double bill;
	public Order(int tableNo, String orderItems, int quantityItems, double bill, Menu menu) {
		super();
		this.tableNo = tableNo;
		this.orderItems = orderItems;
		this.quantityItems = quantityItems;
		this.bill = bill;
		this.menu = menu;
	
	}
	
	
	

}
