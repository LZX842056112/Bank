package com.atguigu.javase.banking;

public class SavingAccount extends Account{
	
	private double interestRate;

	public SavingAccount(double balance, double interest_rate) {
		super(balance);
		this.interestRate = interest_rate;
	}
}
