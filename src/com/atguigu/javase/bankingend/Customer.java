package com.atguigu.javase.bankingend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//用户信息
public class Customer {
	
	private String firstName;
	private String lastName;
	private List<Account> accounts;
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
		accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account account) {
		accounts.add(account);
	}
	
	//它返回与给出的index参数相关的账户。
	public Account getAccount(int index) {
		return accounts.get(index);
	}
	
	//返回 numberOfAccounts 属性值。
	public int getNumOfAccounts() {
		return accounts.size();
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	public Iterator<Account> getAccounts() {
		return accounts.iterator();
	}

}
