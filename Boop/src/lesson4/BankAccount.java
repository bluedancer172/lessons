package lesson4;

import java.util.ArrayList;

public class BankAccount {
	private double amount = 0;

	private ArrayList<Transaction> transactionHistory = new ArrayList<Transaction>();

	public void deposit(double amountToBeAdded) {
		amount = amount + amountToBeAdded;
		Transaction transaction = new Transaction("deposit", amountToBeAdded);
		transactionHistory.add(transaction);
	}

	public void withdraw(double amountToBeWithdrawn) {
		amount = amount - amountToBeWithdrawn;
		Transaction transaction = new Transaction("withdraw", amountToBeWithdrawn*(-1));
		transactionHistory.add(transaction);
	}

	public double getCurrentBalance() {
		return amount;
	}

	public ArrayList<Transaction> getTransactionHistory() {
		return this.transactionHistory;
	}
}
