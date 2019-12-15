package com.atguigu.javase.banking1;
//帐户金额信息
public class Account {
	
	protected double balance;//保留了银行帐户的当前（或 即 时）余额。

	public Account(double init_balance) {
		this.balance = init_balance;
	}

	//获取余额。
	public double getBalance() {
		return balance;
	}
	
	//向当前余额增加金额。
	public boolean deposit(double amt) {
		if (amt >= 0) {
			balance += amt;
			System.out.println("存入金额为：" + amt);
			return true;
		} else {
			return false;
		}
	}
	
	//从当前余额中减去金额。
	public boolean withdraw(double amt) {
		if (amt >= 0 && amt <= balance) {
			this.balance -= amt;
			System.out.println("取出金额为：" + amt);
			return true;
		} else {
			return false;
		}
	}

}
