package com.icici.shoporder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ShoporderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoporderApplication.class, args);
	}

}
