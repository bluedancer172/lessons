package lesson6;

import java.util.Scanner;

public class NumbersRunner {

	public static void main(String[] args) {
		Numbers numbers = new Numbers(7);
		System.out.println("Here are your numbers:");
		numbers.printNumbers();

		int nextNumber = 0;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println("  "
					+ "Please Enter \n 1 to sort and print the elements of the array, \n 2 to print the sum of all elements of the array, \n 3 to print the average of all elements of the array,  \n 4 to stop.");
			nextNumber = scanner.nextInt();
			switch (nextNumber) {
			case 1:
				numbers.sortNumbers();
				numbers.printNumbers();
				break;
			case 2:
				int total = numbers.getTotal();
				System.out.println("total =" + total);
				break;
			case 3:
				int average = numbers.getAverage();
				System.out.println("average = " + average);
				break;
			case 4:
				System.out.println("Goodbye.");
				scanner.close();
				break;
			}
		} while (nextNumber != 4);
	}

}
