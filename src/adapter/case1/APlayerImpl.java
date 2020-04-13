package adapter.case1;

public class APlayerImpl implements APlayer {

	@Override
	public void play(String fileName) {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("(A) "+i+" : " + fileName);
		}
	}

	@Override
	public void stop() {
		System.out.println("(A) stop");
	}
}
