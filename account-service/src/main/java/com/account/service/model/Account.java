package com.account.service.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ACCOUNT_TABLE")
@Data
@NoArgsConstructor
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "account_number")
	private int accountNumber;
	
	@Column(name = "holder_name")
	private String accountHolderName;
	
	@Column(name = "account_balance")
	private double accountBalance;
	
	@Column(name = "active_status")
	private boolean isActive;
	
	public Account(String name, double balance, boolean status) {
		super();
		this.accountHolderName = name;
		this.accountBalance = balance;
		this.isActive = status;
	}

}
