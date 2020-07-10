package lesson3;

import java.util.Scanner;

public class FibonacciSequenceRunner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int numberOfSequence=0;
		do {
				System.out.println("Please enter the amount of sequences you would like to generate: ");
				numberOfSequence = scanner.nextInt();
				FibonacciSequence.generateFibonacciSequence(numberOfSequence);
		} while (numberOfSequence != 0);
		
		System.out.println("Thank you");
		scanner.close();
	}
}