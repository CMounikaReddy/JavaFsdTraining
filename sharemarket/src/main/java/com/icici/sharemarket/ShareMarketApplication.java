package com.icici.sharemarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.icici.sharemarket")
public class ShareMarketApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(ShareMarketApplication.class, args);
	}

}
