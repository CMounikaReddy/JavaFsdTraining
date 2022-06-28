package com.icici.dao;

import com.icici.entity.Customer;

public class CustomerClient {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setCustomername("Peak");
		customer.setAge(32);
			
		CustomerDaoImpl customerDaoImpl= new CustomerDaoImpl();
		
		//customerDaoImpl.saveCustomer(customer);
		
		//customerDaoImpl.custToProd(6,28);
		
		customerDaoImpl.getCustomerList();
	}

}

