package com.shopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;
import com.shopping.repository.ShoppingRepository;

@Service
public class ShoppingService {
	
	@Autowired
	public ShoppingRepository sr;
	
	public OrderItem getJoin(int id){
		return sr.getJoin(id);
	}
	public Orders getJoinOrders(int id){
		return sr.findByOrderId(id);
	}
	
	public Orders findByOrderIdItem(int id){
		return sr.findByOrderIdItem(id);
	}
	public List<Customer> find(Customer customer){
		
		String[] bean = new String[3];
		
		bean[0] = customer.getName().trim();
		bean[1] = customer.getAddress().trim();
		bean[2] = customer.getEmail().trim();
		
		for (int i = 0; i < bean.length; i++) {
			if(bean[i].isEmpty()){
				bean[i] = null;
			}
			/*else{
				if(bean[i].substring(0,1).equals("%")){
					bean[i] = bean[i].substring(1, bean[i].length()-1);
				}
				bean[i] = "%"+bean[i]+"%";
			}*/
		}
		
		customer.setName(bean[0]);
		customer.setAddress(bean[1]);
		customer.setEmail(bean[2]);
		
		List<Customer> lists = sr.find(customer);
		
		
		
		return sr.find(customer);
	}
	public Product findByProductId(int id) {
		// TODO Auto-generated method stub
		return sr.findByProductId(id);
	}
}