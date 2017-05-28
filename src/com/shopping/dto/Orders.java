package com.shopping.dto;

import java.util.List;

public class Orders {
	private int id;
	private String date;
	private Customer customer;
	private List<OrderItem> items;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderItem> getItems() {
		return items;
	}

	public void setItems(List<OrderItem> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", date=" + date + ", customer=" + customer
				+ ", items=" + items + "]";
	}

}
