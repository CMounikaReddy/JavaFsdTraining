package com.market.asgn3;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ProductRetrieve {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("corebanking");
	 EntityManager entityManager = emf.createEntityManager();

	 entityManager.getTransaction().begin();
	 
	 //Transaction.begin();
	 
	 int key = int.valueOf(5);
	 Product p = entityManager.find(Product.class, key);
	 System.out.println(p.getProductName() + p.getPrice() + p.getRating());

	 entityManager.getTransaction().commit();

}
