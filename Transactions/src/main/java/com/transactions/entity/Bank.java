package com.transactions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_details")

public class Bank {
		
		@GeneratedValue
		@Id
		private int bankId;
		
		private String bankCode;
	        
	        private String bankName;
		
		@ManyToOne
		private Customer customer;

		public int getBankId() {
			return bankId;
		}

		public void setBankId(int bankId) {
			this.bankId = bankId;
		}

		public String getBankCode() {
			return bankCode;
		}

		public void setBankCode(String bankCode) {
			this.bankCode = bankCode;
		}

		public String getBankName() {
			return bankName;
		}

		public void setBankName(String bankName) {
			this.bankName = bankName;
		}

		public Customer getCustomer() {
			return customer;
		}

		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		
		

}
