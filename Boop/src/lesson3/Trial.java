package lesson3;

public class Trial {

	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 1;
		for(int i =1; i<= 100; i++){
			System.out.println(i + ":" + number1) ;

			int temp = number1;
			number1 = number2;
			number2 = temp + number2;
       }
       }
	}
