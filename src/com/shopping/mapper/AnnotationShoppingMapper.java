package com.shopping.mapper;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;

import com.shopping.dto.Customer;
import com.shopping.dto.OrderItem;
import com.shopping.dto.Orders;
import com.shopping.dto.Product;


public interface AnnotationShoppingMapper {
	
	@Select("")
	abstract Product findByProductId(int id);
	@Select("SELECT * FROM ORDER_ITEM WHERE ORDER_ITEM_ID = #{ID}")
	@Results({
		@Result(id=true, property="id", column="order_item_id"),
		@Result(property="amount", column="amount"),
		@Result(property="product", column="product_id", one=@One(select="com.shopping.mapper.shoppingMapper.AnnotationShoppingMapper.findByProductId"))
	})
	abstract OrderItem findByOrderItemId(int id);
	
	abstract OrderItem getJoin(int id);
	abstract Orders findByOrderId(int id);
	abstract OrderItem findByOrderIdFromOrderItem(int id);
	//abstract List<Customer> find(Customer customer);
	@SelectProvider(type=com.shopping.mapper.CustomerSqlProvider.class, method="find")
	abstract Customer find (Customer customer);
}
