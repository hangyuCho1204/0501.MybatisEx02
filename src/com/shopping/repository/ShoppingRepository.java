package com.shopping.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;

@Repository
public interface ShoppingRepository {
	OrderItem getJoin(int id);
	Orders findByOrderId(int id);
	
	
	OrderItem findByOrderIdFromOrderItem(int id);
	List<Customer> find(Customer customer);
	Product findByProductId(int id);
	Customer findByCustomerId(int id);
	Orders findByOrderIdItem(int id);

}