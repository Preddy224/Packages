package com.bank.app;

import com.bank.customers.Customer;
import com.bank.accounts.BankAccount;

public class BankApp {

	public static void main(String[] args) {
		Customer customer1 =new Customer();
		customer1.setCustomerId(1);
		customer1.setCustomerName("peera ");
		
		BankAccount bankAccount1=new BankAccount();
		bankAccount1.setAccountNumber("1111115a");
		bankAccount1.setBalance(100000);
		
		// TODO Auto-generated method stub
		
		
		bankAccount1.showAccountDetails();
		customer1.showCustomerDetails();
	}

}
