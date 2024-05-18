package com.javahongkong.bootcamp.exercise;

import java.util.LinkedHashMap;

public class Bank {
	private LinkedHashMap<Long, Account> accounts; // object reference

	public Bank() {
		accounts = new LinkedHashMap<Long, Account>();
	}

	public Account getAccount(Long accountNumber) {
		// complete the function
		Account a = accounts.get(accountNumber);
		return a;
	}

	public Long openCommercialAccount(Company company, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber;
		if (accounts.isEmpty()) {
			accountNumber = 1L;
		} else {
			accountNumber = (Long)accounts.keySet().toArray()[accounts.size()-1]+1;
		}
		Account acc = new CommercialAccount(company, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber, acc);
		return accountNumber;
	}

	public Long openConsumerAccount(Person person, int pin, double startingDeposit) {
		// complete the function
		Long accountNumber;
		if (accounts.isEmpty()) {
			accountNumber = 1L;
		} else {
			accountNumber = (Long)accounts.keySet().toArray()[accounts.size()-1]+1;
		}
		Account acc = new ConsumerAccount(person, accountNumber, pin, startingDeposit);
		accounts.put(accountNumber,acc);
		return accountNumber;
	}

	public boolean authenticateUser(Long accountNumber, int pin) {
		// complete the function
		return accounts.get(accountNumber).validatePin(pin);
	}

	public double getBalance(Long accountNumber) {
		// complete the function
		return accounts.get(accountNumber).getBalance();
	}

	public void credit(Long accountNumber, double amount) {
		// complete the function
		accounts.get(accountNumber).creditAccount(amount);
	}

	public boolean debit(Long accountNumber, double amount) {
		// complete the function
		return accounts.get(accountNumber).debitAccount(amount);
	}
}
