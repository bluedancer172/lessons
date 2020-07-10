package lesson5;

public class MethodTest3 {
	static void greeting() {
		System.out.println("Hi!");
	};
	static void greeting(String enterName) {
		System.out.println("Hi" + enterName);
	}
	public static void main(String[] args) {
	greeting();
	greeting(" Cake!");
	}
}
