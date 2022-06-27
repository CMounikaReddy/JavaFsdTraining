package com.icici.dao;

import com.icici.entity.Product;

public class ProductClient {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setProdName("One Plus 10R");
		product.setPrice(38999);
			
		ProductDaoImpl productDaoImpl= new ProductDaoImpl();
		
		productDaoImpl.saveProduct(product);

	}

}
