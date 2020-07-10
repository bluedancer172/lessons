package lesson1;

public class Piano implements IPiano {

	private int volume = 0;
	private boolean isOn = false;

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public void volumeUp() {
		volume = volume + 1;
	}

	public void volumeDown() {
		volume = volume - 1;
	}

	public void changeVolume(int vol) {
		volume = vol;
	}

	public void printStates() {
		System.out.println("Piano's volume= " + volume);
		System.out.println("Piano isOn= " + isOn);
	}
}
