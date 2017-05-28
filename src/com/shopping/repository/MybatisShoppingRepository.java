package com.shopping.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;
import com.shopping.mapper.ShoppingMapper;

@Repository
public class MybatisShoppingRepository implements ShoppingRepository{

	@Autowired
	public ShoppingMapper mapper;
	
	@Override
	public OrderItem getJoin(int id) {
		/*System.out.println("id : "+id);
		System.out.println("mapper.getJoin : "+mapper.getJoin(id));*/
		return mapper.getJoin(id);
	}
	
	@Override
	public Customer findByCustomerId(int id) {
		// TODO Auto-generated method stub
		return mapper.findByCustomerId(id);
	}
	
	@Override
	public Product findByProductId(int id) {
		// TODO Auto-generated method stub
		return mapper.findByProductId(id);
	}

	@Override
	public Orders findByOrderId(int id) {
		
		/*System.out.println("id : "+id);
		System.out.println("mapper.findByOrderId : "+mapper.findByOrderId(id));*/
		
		return mapper.findByOrderId(id);
	}

	
	
	
	@Override
	public Orders findByOrderIdItem(int id) {
		System.out.println("repo id : "+id);
		System.out.println("findByOrderIdItem : "+mapper.findByOrderIdItem(id));
		return mapper.findByOrderIdItem(id);
	}
	
	@Override
	public OrderItem findByOrderIdFromOrderItem(int id) {
		System.out.println("repo id : "+id);
		System.out.println("findByOrderIdFromOrderItem : "+mapper.findByOrderIdFromOrderItem(id));
		return mapper.findByOrderIdFromOrderItem(id);
	}

	@Override
	public List<Customer> find(Customer customer) {
		/*System.out.println("repo customer : "+customer);
		System.out.println("repo : "+mapper.find(customer));*/
		
		return mapper.find(customer);
	}



	/*@Override
	public OrderItem findByOrderItemId(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/

	
}