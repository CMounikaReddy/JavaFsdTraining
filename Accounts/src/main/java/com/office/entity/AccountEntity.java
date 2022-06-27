package com.office.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

public class AccountEntity {
	
	@Entity
	@Table(name = "ACCOUNT")
	public class AccountEntitys{

	      @Id
	      @GeneratedValue(strategy = GenerationType.IDENTITY)
	      @Column(name = "ID")
	      private Integer accountId;

	      @OneToOne(mappedBy = "account")
	      private EmployeeEntity employee;

}
