package singleton.case2;

public class TestPatten1 {
	public static void main(String[] args) {
		LogWriter logWriter;
		
		logWriter = LogWriter.getInstance();
		logWriter.log("첫번째");

		logWriter = LogWriter.getInstance();
		logWriter.log("두번째");
	
	}
}
