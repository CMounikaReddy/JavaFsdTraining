package com.icici.shoporder.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icici.shoporder.pojo.OrderPojo;

@RestController
@RequestMapping(path = "/order")	
public class OrderController {
	
	@GetMapping(path="/getOrder", produces = "application/json")
	    public OrderPojo getOrders() 
	    {
		OrderPojo orderPojo = new OrderPojo();
		orderPojo.setOrderName("First Purchase");
		orderPojo.setOrderId(3031);
		orderPojo.setPrice(2724);
	    	
			 return orderPojo;
	    }
	    	
}
