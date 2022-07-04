package com.icici.shopcustomer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.icici.shopcustomer.pojo.CustomerPojo;
import com.icici.shoporder.pojo.OrderPojo;

@RestController
@RequestMapping(path = "/customer")	
public class CustomerController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(path="/getCustomerorders", produces = "application/json")
    public CustomerPojo getCustOrders() 
    {
		CustomerPojo cusPojo = new CustomerPojo();
		cusPojo.setCusName("Mouni");
		cusPojo.setCusId(30);
		OrderPojo orderPojo = restTemplate.getForObject("http://ORDER-SERVICES/order/getOrder",
				OrderPojo.class);
		
		cusPojo.setOrderPojo(orderPojo);
    	
		 return cusPojo;
    }

}
