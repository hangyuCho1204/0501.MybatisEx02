package com.shopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shopping.condition.OrderItemCondition;
import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;
import com.shopping.service.ShoppingService;

@Controller
public class ShoppingController {
	
	@Autowired
	private ShoppingService ss;
	
	@RequestMapping(value="/searchOrderItem", method=RequestMethod.GET)
	public String searchOrderItem(@ModelAttribute OrderItemCondition orderItemCondition ){
		return "searchOrderItem";
	}
	
	@RequestMapping(value="/searchOrderItem", method=RequestMethod.POST)
	public String searchOrderItemPo(@ModelAttribute OrderItemCondition orderItemCondition, Model model){
		
		OrderItem bean = ss.getJoin(orderItemCondition.getId());
		model.addAttribute("bean", bean);
		return "searchOrderItem";
	}
	
	@RequestMapping(value="/SearchOrder", method=RequestMethod.GET)
	public String searchOrder(@ModelAttribute Orders orders){
		
		return "searchOrder";
	}
	
	@RequestMapping(value="/SearchOrder", method=RequestMethod.POST)
	public String SearchOrderItem(@ModelAttribute Orders orders, Model model){
		
		Orders bean2 = ss.getJoinOrders(orders.getId());
		model.addAttribute("bean", bean2);
		return "searchOrder";
	}
	
	@RequestMapping(value="/SearchOitem", method=RequestMethod.GET)
	public String SearchOrderItem(@ModelAttribute Orders orders){
		
		return "searchOitem";
	}
	
	@RequestMapping(value="/SearchOitem", method=RequestMethod.POST)
	public String SearchCustomer(@ModelAttribute Orders orders, Model model){
		
		Orders bean = ss.findByOrderIdItem(orders.getId());
		
		model.addAttribute("bean", bean);
		
		return "searchOitem";
	}
	
	@RequestMapping(value="/SearchCustomer", method=RequestMethod.GET)
	public String SearchCustomer(@ModelAttribute Customer customer){
		
		return "searchCustomer";
	}
	
	@RequestMapping(value="/SearchCustomer", method=RequestMethod.POST)
	public String searchOrder(@ModelAttribute Customer customer, Model model){
		
		List<Customer> lists = ss.find(customer);
		
		
		
		model.addAttribute("lists", lists);
		return "searchCustomer";
	}
}
