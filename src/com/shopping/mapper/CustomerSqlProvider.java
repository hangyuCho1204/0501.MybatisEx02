package com.shopping.mapper;

import org.apache.ibatis.jdbc.SQL;

import com.shopping.dto.Customer;

public class CustomerSqlProvider {
	public String find(final Customer customer){
		return new SQL(){
			{
				SELECT("* ");
				FROM("customer");
				
				if(customer.getName() != null){
					WHERE("name like #{name}");
				}
				if(customer.getAddress() != null){
					WHERE("name like #{address}");
				}
				if(customer.getEmail() != null){
					WHERE("name like #{email}");
				}
			}
		}.toString();
	}
}
//µ¿Àû sql
