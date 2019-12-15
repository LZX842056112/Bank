package com.atguigu.javase.banking2;
//支票账户
public class CheckingAccount extends Account {
	
	private SavingAccount protectedBy;
	
	public CheckingAccount(double balance) {
		super(balance);
	}

	public CheckingAccount(double balance, SavingAccount protect) {
		super(balance);
		this.protectedBy = protect;
	}

	@Override
	public boolean withdraw(double amt) {
		if (balance >= amt) {
			balance -= amt;
			System.out.println("取出金额为：" + amt);
		}else {
			if (protectedBy != null && protectedBy.getBalance() >= (amt - balance)){
				protectedBy.withdraw(amt - balance);
				System.out.println("取出金额为：" + amt + "透支：" + (amt - balance) + "透支余额:" + protectedBy.getBalance());
				balance = 0;
			}else {
				return false;
			}
		} 
		return true;
	}
}
