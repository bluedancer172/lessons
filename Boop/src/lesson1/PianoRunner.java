package lesson1;

public class PianoRunner {

	public static void main(String[] args) {

		Piano piano1 = new Piano();
		
		piano1.turnOn();
		piano1.changeVolume(4);
		piano1.volumeDown();
		
		System.out.println("piano1 :)");
		piano1.printStates();

		Piano piano2 = new Piano();
		
		piano2.volumeUp();
		piano2.turnOn();
		piano2.volumeUp();
		
		System.out.println("piano2");
		piano2.printStates();
	}

}
