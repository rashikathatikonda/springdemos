package com.examples.S04InterfaceInjection.dao;

import org.springframework.stereotype.Component;

@Component("orderdaooracle")
public class OrderDaoOracleImpl implements OrderDAO{

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Open connection to Oracle DB");
		System.out.println("Run insert statement on Oracle DB");
		System.out.println("Order created in Oracle DB");
		
	}

}
