package com.atguigu.javase.banking1;

public class Bank {
	
	private Customer[] customers;
	private int numberOfCustomer;//跟踪下一个 customers 数组索引
	
	public Bank() {
		customers = new Customer[5];
	}
	
	public void addCustomer(String f, String l) {
			Customer customer = new Customer(f, l);
			customers[numberOfCustomer++] =customer;
	}

	//它返回与给出的index参数相关的客户。
	public Customer getCustomer(int index) {
			return customers[index];
	}

	//返回 numberofCustomers 属性值。
	public int getNumberOfCustomer() {
		return numberOfCustomer;
	}
	
	

}
