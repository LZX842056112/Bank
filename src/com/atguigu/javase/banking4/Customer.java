package com.atguigu.javase.banking4;
//用户信息
public class Customer {
	
	private String firstName;
	private String lastName;
	private Account[] accounts;
	private int numberOfAccounts;//跟踪下一个 accounts 数组索引
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
		accounts = new Account[2];
	}
	
	public void addAccount(Account account) {
		accounts[numberOfAccounts++] = account;
	}
	
	//它返回与给出的index参数相关的账户。
	public Account getAccount(int index) {
		return accounts[index];
	}
	
	//返回 numberOfAccounts 属性值。
	public int getNumOfAccounts() {
		return numberOfAccounts;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	

}
