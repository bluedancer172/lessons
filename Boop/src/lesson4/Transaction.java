package lesson4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Transaction {
	private LocalDateTime transactionDate;

	private String transactionType;

	private double transactionAmount;

	public Transaction(String type, double amount) {
		this.transactionType = type;
		this.transactionAmount = amount;
		LocalDateTime currentDateTime = LocalDateTime.now();
		this.transactionDate = currentDateTime;
	}

	public LocalDateTime getDate() {
		return this.transactionDate;
	}

	public String getType() {
		return this.transactionType;
	}

	public double getAmount() {
		return this.transactionAmount;
	}

	public String getTransactionDetails() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm:ss");
		String formattedDate = this.transactionDate.format(formatter);

		return formattedDate + "|" + this.transactionType + "|" + this.transactionAmount;
	}

}
