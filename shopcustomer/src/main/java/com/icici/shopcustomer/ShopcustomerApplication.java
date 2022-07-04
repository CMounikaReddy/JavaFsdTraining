package com.icici.shopcustomer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class ShopcustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopcustomerApplication.class, args);
	}
	
	 @LoadBalanced
	    @Bean
	    RestTemplate restTemplate() {
	        return new RestTemplate();
	    }

}
