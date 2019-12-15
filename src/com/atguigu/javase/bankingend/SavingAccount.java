package com.atguigu.javase.bankingend;

public class SavingAccount extends Account{
	
	private double interestRate;//利息

	public SavingAccount(double balance, double interest_rate) {
		super(balance);
		this.interestRate = interest_rate;
	}
	public double getInterestRate() {
		return interestRate;
	}
}
