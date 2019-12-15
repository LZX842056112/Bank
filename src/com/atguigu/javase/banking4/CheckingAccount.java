package com.atguigu.javase.banking4;

public class CheckingAccount extends Account {
	
	private Double overdraftProtection;
	
	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, double protect) {
		super(balance);
		this.overdraftProtection = protect;
	}
	
	@Override
	public void withdraw(double amt) throws OverdraftException{
		
		if (balance >= amt) {
			balance -= amt;
			System.out.println("取出金额为：" + amt);
		}else {
			if (overdraftProtection == null) {
				throw new OverdraftException("资金不足且没有透支", amt - balance);
			}
			if(overdraftProtection >= (amt - balance)){
				overdraftProtection -= (amt - balance);
				System.out.println("取出金额为：" + amt + "透支：" + (amt - balance) + "透支余额:" + overdraftProtection);
				balance = 0;
			}else {
				throw new OverdraftException("资金不足且透支不足", amt - balance);
			}
		} 
	}
}
