package com.atguigu.javase.bankingend;

import java.util.Iterator;

public class CustomerReport {

	public void generateReport() {
		 Bank bank = Bank.getBanking();
		 Customer customer;
		 Iterator<Customer> customers = bank.getCustomers();
		 
		 while (customers.hasNext()) {
			customer = customers.next();
			System.out.println(customer.getFirstName() + customer.getLastName());
			
			Account account;
			Iterator<Account> accounts = customer.getAccounts();
			
			while (accounts.hasNext()) {
				account = accounts.next();
				
				String account_type = "";
				
				if (account instanceof CheckingAccount) {
					account_type = "CheckingAccount";
				} else if (account instanceof SavingAccount) {
					account_type = "SavingAccount";
				}
				
				try {
					System.out.println(account_type + "：" + account.getBalance());
					account.deposit(100);
					System.out.println(account_type + "：" + account.getBalance());
					account.withdraw(1000);
					System.out.println(account_type + "：" + account.getBalance());
				} catch (OverdraftException e) {
					System.out.println("Exception: " + e.getMessage() + "   Deficit: " + e.getDeficit());
				}
			}
		 }
	}
}
