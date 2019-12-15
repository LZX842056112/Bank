package com.atguigu.javase.banking1;

public class CheckingAccount extends Account {
	
	private double overdraftProtection;
	
	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}
	
	@Override
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("取出金额为：" + amt);
		}else {
			if(overdraftProtection >= (amt - balance)){
				overdraftProtection -= (amt - balance);
				System.out.println("取出金额为：" + amt + "透支：" + (amt - balance) + "透支余额:" + overdraftProtection);
				balance = 0;
			}else {
				return false;
			}
		} 
		return true;
	}
}
