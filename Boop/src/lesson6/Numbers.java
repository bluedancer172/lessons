package lesson6;

import java.util.Arrays;

public class Numbers {
	private int[] num;

	public Numbers(int size) {
		num = new int[size];

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.round(Math.random() * 100);
		}
	}

	public void printNumbers() {
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

	public int getTotal() {
		int total = 0;
		for (int i = 0; i < num.length; i++) {
			total += num[i];
		}
		return total;
	}

	public int getAverage() {
		int total = getTotal();
		int average = total / num.length;
		return average;
	}

	public void sortNumbers() {
		Arrays.sort(num);
	}

}
