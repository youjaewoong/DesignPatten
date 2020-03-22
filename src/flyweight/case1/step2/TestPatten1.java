package flyweight.case1.step2;

public class TestPatten1 {
	public static void main(String[] args) {
		
		//공통된 부분을 재사용하는 flyweightPatten
		FlyweightFactory flyweight = new FlyweightFactory();
		
		flyweight.getSubject("a");
		flyweight.getSubject("a");
		flyweight.getSubject("b");
		flyweight.getSubject("b");
		
	}
}
