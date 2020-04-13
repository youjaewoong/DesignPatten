package adapter.case3;

public class WildTurkey implements Turkey{



	@Override
	public void fly() {
		System.out.println("I'm flying");
		
	}

	@Override
	public void gobble() {
		System.out.println("Gobble gobble");
		
	}

}
