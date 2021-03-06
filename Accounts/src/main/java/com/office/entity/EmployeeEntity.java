package com.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")

public class EmployeeEntity{
	
	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      @Column(name = "ID")
	      private Integer employeeId;

	      @OneToOne
	      @JoinColumn(name="ACCOUNT_ID")
	      private AccountEntity account;

		public Integer getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(Integer employeeId) {
			this.employeeId = employeeId;
		}

		public AccountEntity getAccount() {
			return account;
		}

		public void setAccount(AccountEntity account) {
			this.account = account;
		}

}
