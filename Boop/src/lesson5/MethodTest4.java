package lesson5;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MethodTest4 {
	public static void main(String args[]) {
		greetMe("Cranberry");
		greetMe();
	}

	public static void greetMe(String name) {
		System.out.println(greeting() + " " + name + ".");
	}

	public static void greetMe() {
		System.out.println(greeting() + ".");
	}

	public static String greeting() {
		LocalDateTime currentDateTime = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH");
		int hourOfDay = Integer.parseInt(currentDateTime.format(formatter));

		String greetingMessage;
		if (hourOfDay >= 5 && hourOfDay < 12) {
			greetingMessage = "Good morning";
		} else if (hourOfDay >= 12 && hourOfDay < 17) {
			greetingMessage = "Good afternoon";
		} else {
			greetingMessage = "Good evening";
		}

		return greetingMessage;

	}

}
