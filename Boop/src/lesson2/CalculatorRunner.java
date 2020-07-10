package lesson2;

public class CalculatorRunner {

	public static void main(String[] args) {
		
		//23.56 + 76.34 * 12.22 / 5.61 - 12.11 = ?
		double one=23.56;
		double two=76.34;
		double three=12.22;
		double four=5.61;
		double five=12.11;

		double number1 = Calculator.multiply(three, two);
		double number2 = Calculator.divide(number1, four);
		double number3 = Calculator.add(number2, one);
		double number4 = Calculator.subtract(number3, five);
	System.out.println(one + " + " + two + " * " +  three + " / " + four + " - " +  five  +  " = " + number4);
	}

}
