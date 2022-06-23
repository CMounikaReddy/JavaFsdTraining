package com.market.asgn3;

public class ProductClient {

	public static void main(String[] args) {
		
		ProductManagementImpl productmgmtImpl = new ProductManagementImpl();
		
		Product product = new Product();
		
		product.setProductName("GiftCard");
		product.setPrice(356);
		product.setRating(9);
		
		productmgmtImpl.sellProduct(product);

	}

}
