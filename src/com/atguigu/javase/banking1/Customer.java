package com.atguigu.javase.banking1;
//用户信息
public class Customer {
	
	private String firstName;
	private String lastName;
	private Account account;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}
	
	public void addAccount(Account account) {
		
	}
	
	public void getAccount(int index) {
	}
	
	public void getNumOfAccounts() {
		
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	

}
