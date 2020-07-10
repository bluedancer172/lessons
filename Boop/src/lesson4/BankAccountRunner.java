package lesson4;

import java.util.ArrayList;
import java.util.Scanner;

public class BankAccountRunner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bankaccount = new BankAccount();
		int option = 0;
		System.out.println("Welcome to Spoon Banks!");
		System.out.println("");
		System.out.println("");
		do {
			System.out.println(
					"Enter: 1 for Deposit, 2 for Withdraw, 3 for Check balance, 4 for check transaction history, or 5 for Stop. ");
			option = scanner.nextInt();
			switch (option) {
			case 1:
				System.out.println("Enter amount to be deposited");
				bankaccount.deposit(scanner.nextDouble());
				System.out.println("");
				System.out.println("Your deposit was succesful.");
				break;
			case 2:
				System.out.println("Enter amount to be withdrawn");
				bankaccount.withdraw(scanner.nextDouble());
				System.out.println("");
				System.out.println("Your withdrawal was succesful.");
				break;
			case 3:
				System.out.println("Your current balance is : " + bankaccount.getCurrentBalance());
				System.out.println("");
				break;
			case 4:
				System.out.println("Your transaction history: ");
				ArrayList<Transaction> transactionHistory = bankaccount.getTransactionHistory();
				for (int i = 0; i < transactionHistory.size(); i++) {
					System.out.println(transactionHistory.get(i).getTransactionDetails());
				}
				System.out.println("");
				break;
			case 5:
				System.out.println("Goodbye.");
				System.out.println("");
				break;
			}

		} while (option != 5);

		System.out.println("Thank you");
		scanner.close();
	}
}
