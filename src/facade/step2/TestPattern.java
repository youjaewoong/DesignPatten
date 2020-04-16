package facade.step2;

public class TestPattern {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
        Light light = new Light();
        Radio radio = new Radio();

		// 이전 사용 방식
        System.out.println("========집에 나갈때 파사드 적용 전==========");
        computer.turnOff();
        light.turnOff();
        radio.turnOff();
        
        System.out.println("========집에 들어올때 파사드 적용 후==========");
        // 파사드 패턴 적용 후 사용 방식
        HomeFacade home = new HomeFacade(computer, light, radio);
        home.homeIn();
	}
}
