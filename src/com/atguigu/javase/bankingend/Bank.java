package com.atguigu.javase.bankingend;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bank {
	
	private List<Customer> customers;
	
	private Bank() {
		customers= new ArrayList<Customer>();
	}
	
	private static Bank instance = new Bank();
	
	public static Bank getBanking() {
		return instance;
	}
	
	public void addCustomer(String f, String l) {
			Customer customer = new Customer(f, l);
			customers.add(customer);
	}

	//它返回与给出的index参数相关的客户。
	public Customer getCustomer(int index) {
			return customers.get(index);
	}

	//返回长度
	public int getNumberOfCustomer() {
		return customers.size();
	}
	
	public Iterator<Customer> getCustomers() {
		return customers.iterator();
	}
}
