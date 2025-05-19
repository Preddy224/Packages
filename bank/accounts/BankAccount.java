package com.bank.accounts;

public class BankAccount {
	private String accountNumber;
	private double balance; 
	
	public void setAccountNumber(String accountNumber) {
		this.accountNumber=accountNumber;
	}
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	
	public void showAccountDetails() {
		System.out.println("Account holder name is :-" +  accountNumber);
		System.out.println("balance amount in $ :- "+balance);
}

}