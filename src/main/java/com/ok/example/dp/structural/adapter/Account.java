package com.ok.example.dp.structural.adapter;

public class Account {
	private int balance;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}
