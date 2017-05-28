package com.shopping.mapper;

import java.util.List;

import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;

public interface ShoppingMapper {
	
	abstract Product findByProductId(int id);
	abstract Customer findByCustomerId(int id);
	abstract OrderItem findByOrderItemId(int id);
	
	abstract OrderItem getJoin(int id);
	abstract Orders findByOrderId(int id);
	abstract OrderItem findByOrderIdFromOrderItem(int id);
	abstract List<Customer> find(Customer customer);
	abstract Orders findByOrderIdItem(int id);
}
