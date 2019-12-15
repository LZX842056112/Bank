package com.atguigu.javase.banking3;

public class TestBanking {

  public static void main(String[] args) {
	  Bank bank = new Bank();
	  Customer customer;
	  
	  bank.addCustomer("李", "熊猫");
	  customer = bank.getCustomer(0);
	  customer.addAccount(new CheckingAccount(500));
	  customer.addAccount(new SavingAccount(600, 0.03));
	  
	  bank.addCustomer("张", "熊猫");
	  customer = bank.getCustomer(1);
	  customer.addAccount(new CheckingAccount(400,400));
	  customer.addAccount(new SavingAccount(500, 0.02));
	  
	  bank.addCustomer("王", "熊猫");
	  customer = bank.getCustomer(2);
	  customer.addAccount(bank.getCustomer(1).getAccount(0));
	  customer.addAccount(new SavingAccount(600, 0.03));
	  
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
			System.out.println(account_type + "：" + account.getBalance());
		}
	}
  }
}
