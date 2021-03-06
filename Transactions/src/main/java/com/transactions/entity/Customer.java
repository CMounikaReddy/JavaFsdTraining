package com.transactions.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_detail")

@NamedQuery(name = "Customer_like" , query = "Select e from Customer e where e.customerName LIKE :customerName || '%'")

public class Customer {
	
		@Id
		@Column(name = "customer_id")
		private int customerId;

		@Column(name = "customer_name")
		private String customerName;

		private double amount;

		private String accType;
		
		
		@OneToMany(mappedBy = "customer",cascade = {CascadeType.ALL})
		List<Bank> banks;


		public int getCustomerId() {
			return customerId;
		}


		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}


		public String getCustomerName() {
			return customerName;
		}


		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}


		public double getAmount() {
			return amount;
		}


		public void setAmount(double amount) {
			this.amount = amount;
		}


		public String getAccType() {
			return accType;
		}


		public void setAccType(String accType) {
			this.accType = accType;
		}


		public List<Bank> getBanks() {
			return banks;
		}


		public void setBanks(List<Bank> banks) {
			this.banks = banks;
		}

}
