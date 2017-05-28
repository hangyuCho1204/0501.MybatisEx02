package com.shopping.dto;

public class OrderItem {
	private int id;
	private int amount;
	private int order_id;
	private Product product;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", amount=" + amount + ", order_id="
				+ order_id + ", product=" + product + "]";
	}
	

}