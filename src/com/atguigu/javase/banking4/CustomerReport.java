package com.atguigu.javase.banking4;

public class CustomerReport {

	public void generateReport() {
		 Bank bank = Bank.getBanking();
		 Customer customer;
		 
		 for (int i = 0; i < bank.getNumberOfCustomer(); i++) {
				customer = bank.getCustomer(i);
				System.out.println(customer.getFirstName() + customer.getLastName());
				
				Account account;
				for (int j = 0; j < customer.getNumOfAccounts(); j++) {
					account = customer.getAccount(j);
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
