package com.icici.shopproduct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShopproductApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopproductApplication.class, args);
	}

}
