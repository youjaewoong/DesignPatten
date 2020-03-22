package singleton.case2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogWriter {

	private static LogWriter logWriter = new LogWriter();
	private BufferedWriter bw;
	
	private LogWriter() {
		
		try {
			bw = new BufferedWriter(new FileWriter("log.text"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static LogWriter getInstance() {
		return logWriter;
	}
	
	//log writer
	public synchronized void log(String str) {
		try {
			//bw.write(LocalDateTime.now() + ":" + "/n");
			bw.write(str + "\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	protected void finalize() {
		try {
			super.finalize();
			bw.close();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
}
