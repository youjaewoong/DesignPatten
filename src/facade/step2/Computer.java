package facade.step2;

public class Computer {
	private boolean turnedOn = false;

	public void turnOn() {
		turnedOn = true;
		System.out.println("컴퓨터를 킨다.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("컴퓨터를 끈다.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
