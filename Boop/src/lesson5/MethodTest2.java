package lesson5;

public class MethodTest2 {

	static int addNumbers(int x, int y) {
		return x + y;
	}

	static double addNumbers(double x, double y){
		return x + y;
	}
	static double addNumbers(double x, double y, double z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		int total1 = addNumbers(7,235);
		double total2= addNumbers(24365,9);
		double total3= addNumbers(234.97,253.98,75.65);
		System.out.println("If I put two integers:" +  total1 );
		System.out.println("If I put two things that aren't integers/only one integer(Basically decimals)" + total2);
		System.out.println("If I put THREE things that aren't integers/only one itneger(Basically decimals)" + total3);
	}

}
