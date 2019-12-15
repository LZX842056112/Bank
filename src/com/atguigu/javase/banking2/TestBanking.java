package com.atguigu.javase.banking2;

public class TestBanking {

  public static void main(String[] args) {
	  Bank bank = new Bank();
	  Customer customer;
	  Account account;
	  
	  bank.addCustomer("李", "熊猫");
	  customer = bank.getCustomer(0);
	  customer.setSavingAccount(new SavingAccount(600, 0.03));
	  customer.setCheckingAccount(new CheckingAccount(500.00,customer.getSavingAccount()));
	  
	  bank.addCustomer("张", "熊猫");
	  customer = bank.getCustomer(1);
	  customer.setSavingAccount(new SavingAccount(500, 0.02));
	  customer.setCheckingAccount(new CheckingAccount(400,customer.getSavingAccount()));
	  
	  for (int i = 0; i < bank.getNumberOfCustomer(); i++) {
		customer = bank.getCustomer(i);
		account = customer.getCheckingAccount();
		System.out.println(customer.getFirstName() + customer.getLastName());
		System.out.println(account.getBalance());
		System.out.println(customer.getSavingAccount().getBalance());
		
		account.deposit(200);
		account.withdraw(1000);
		
		System.out.println(customer.getFirstName() + customer.getLastName());
		System.out.println(account.getBalance());
		System.out.println(customer.getSavingAccount().getBalance());
		
	}
  }
}
