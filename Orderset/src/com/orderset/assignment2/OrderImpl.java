package com.orderset.assignment2;

import java.util.Optional;
import java.util.Random;

public class OrderImpl {
	
	int createorderid() {

		Random rd = new Random();

		int orderid = rd.nextInt(100000);
		
		return orderid;

	}

	Optional<OrderPojo> createorderid(OrderPojo orderpojo) {
		
		
	    Optional<String> empty = Optional.empty();

	    Optional<OrderPojo> orderpojoobj = Optional.of(orderpojo);


		int orderid = orderpojo.getOrderId();
		
		orderpojo.setOrderId(orderid);
		
		return orderpojoobj;
	}

}
