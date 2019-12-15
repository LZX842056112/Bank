package com.atguigu.javase.banking1;

/*
 * This class creates the program to test the banking classes.
 * It creates a new Bank, sets the Customer (with an initial balance),
 * and performs a series of transactions with the Account object.
 */
public class TestBanking {

  public static void main(String[] args) {
    Account  account = null;
    Customer customer = null;
    Bank bank = null;

    System.out.println("-----------------------------------------------");
    account = new Account(600);
    account.deposit(150);
    System.out.println("余额：" + account.getBalance());
    account.withdraw(100);
    System.out.println("余额：" + account.getBalance());
    
    System.out.println("-----------------------------------------------");
    customer = new Customer("李", "熊猫");
    customer.setAccount(new Account(700));
    System.out.println(customer.getAccount().getBalance());
    customer.getAccount().deposit(150);
    System.out.println(customer.getAccount().getBalance());
    customer.getAccount().withdraw(100);
    System.out.println(customer.getAccount().getBalance());
    System.out.println(customer.getFirstName() + customer.getLastName() + "的余额：" + customer.getAccount().getBalance());
    
    System.out.println("-----------------------------------------------");
    customer = new Customer("李", "熊猫");
    customer.setAccount(new Account(800));
    System.out.println(customer.getAccount().getBalance());
    boolean deposit = customer.getAccount().deposit(200);
    if (deposit) {
		System.out.println("存入成功");
		System.out.println(customer.getFirstName() + customer.getLastName() + "的余额：" + customer.getAccount().getBalance());
	} else {
		System.out.println("存入失败");
	}
    boolean withdraw = customer.getAccount().withdraw(300);
    if (withdraw) {
    	System.out.println("取出成功");
    	System.out.println(customer.getFirstName() + customer.getLastName() + "的余额：" + customer.getAccount().getBalance());
	} else {
		System.out.println("取出失败");
	}
    System.out.println(customer.getFirstName() + customer.getLastName() + "的总余额：" + customer.getAccount().getBalance());
    
    System.out.println("-----------------------------------------------");
    bank = new Bank();
    bank.addCustomer("李","熊猫");
    bank.addCustomer("张","熊猫");
    bank.addCustomer("王","熊猫");
    bank.addCustomer("赵","熊猫");
    bank.addCustomer("孙","熊猫");
    System.out.println(bank.getNumberOfCustomer());
    
    System.out.println("-----------------------------------------------");
    bank = new Bank();
    bank.addCustomer("李","熊猫");
    bank.getCustomer(0).setAccount(new SavingAccount(500, 0.03));//带利息
    bank.addCustomer("张","熊猫");
    bank.getCustomer(1).setAccount(new CheckingAccount(600));
    bank.addCustomer("王","熊猫");
    bank.getCustomer(2).setAccount(new CheckingAccount(600,600));//带透支
    bank.addCustomer("赵","熊猫");
    bank.getCustomer(3).setAccount(bank.getCustomer(2).getAccount());//王赵共用账户
    
    System.out.println(bank.getCustomer(0).getFirstName() + "余额：" + bank.getCustomer(0).getAccount().getBalance());
    bank.getCustomer(0).getAccount().deposit(200);
    System.out.println(bank.getCustomer(0).getFirstName() + "余额：" + bank.getCustomer(0).getAccount().getBalance());
    bank.getCustomer(0).getAccount().withdraw(300);
    System.out.println(bank.getCustomer(0).getFirstName() + "余额：" + bank.getCustomer(0).getAccount().getBalance());
    
    System.out.println(bank.getCustomer(1).getFirstName() + "余额：" + bank.getCustomer(1).getAccount().getBalance());
    bank.getCustomer(1).getAccount().deposit(200);
    System.out.println(bank.getCustomer(1).getFirstName() + "余额：" + bank.getCustomer(1).getAccount().getBalance());
    bank.getCustomer(1).getAccount().withdraw(900);
    System.out.println(bank.getCustomer(1).getFirstName() + "余额：" + bank.getCustomer(1).getAccount().getBalance());
    
    System.out.println(bank.getCustomer(2).getFirstName() + "余额：" + bank.getCustomer(2).getAccount().getBalance());
    bank.getCustomer(2).getAccount().deposit(200);
    System.out.println(bank.getCustomer(2).getFirstName() + "余额：" + bank.getCustomer(2).getAccount().getBalance());
    bank.getCustomer(2).getAccount().withdraw(900);
    System.out.println(bank.getCustomer(2).getFirstName() + "余额：" + bank.getCustomer(2).getAccount().getBalance());
    
    System.out.println(bank.getCustomer(3).getFirstName() + "余额：" + bank.getCustomer(3).getAccount().getBalance());
    bank.getCustomer(3).getAccount().deposit(200);
    System.out.println(bank.getCustomer(3).getFirstName() + "余额：" + bank.getCustomer(3).getAccount().getBalance());
    bank.getCustomer(3).getAccount().withdraw(300);
    System.out.println(bank.getCustomer(3).getFirstName() + "余额：" + bank.getCustomer(3).getAccount().getBalance());
    
    System.out.println("-----------------------------------------------");
    
    
    
    
  }
}
