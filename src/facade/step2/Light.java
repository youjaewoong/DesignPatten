package facade.step2;

public class Light {
	private boolean turnedOn = false;

	public void turnOn() {
		turnedOn = true;
		System.out.println("불을 킨다.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("불을 끈다.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
