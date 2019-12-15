package com.atguigu.javase.bankingend;

public class TestBanking {

  public static void main(String[] args) {
	  Bank bank = Bank.getBanking();
	  Customer customer;
	  CustomerReport customerReport = new CustomerReport();
	  
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
	  
	  customerReport.generateReport();
  }
}
