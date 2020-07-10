package lesson3;

import java.math.BigInteger;

public class FibonacciSequence {

	static void generateFibonacciSequence(int total) {
	
		BigInteger number1 = new BigInteger("0");
		BigInteger number2 = new BigInteger("1");
		for(int i =1; i<= total; i++){
		System.out.println(number1);
		BigInteger temp = number1;
			number1 = number2;
			number2 = temp.add(number2)  ;
       }
	}
	}

