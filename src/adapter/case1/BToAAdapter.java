package adapter.case1;

// object adapter implementation
// B --> A
public class BToAAdapter implements APlayer {

	private BPlayer media;
	private APlayer a_media;
	
	public BToAAdapter(BPlayer media) {
		this.media = media;
	}
	
	@Override
	public void play(String fileName) {
		// A의 메서드로 B의 메서드를 호출
		System.out.print("Using Adapter : ");
		media.playFile(fileName);
	}

	@Override
	public void stop() {
		a_media.stop();
	}

}

// 기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용.
// 기존에 잘 사용되던 클래스이므로
// 버그가 발생하면 어댑터 클래스만 집중적으로 살펴보면 된다.
