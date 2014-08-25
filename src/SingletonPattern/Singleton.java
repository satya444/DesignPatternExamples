package SingletonPattern;

public class Singleton {
	public static Singleton logger = null;

	private Singleton() {

	}

	public void writeLog(String message) {
		System.out.println("Line being written to file--"+message);
	}

	public static Singleton getInstance() {
		if (logger == null) {
			logger = new Singleton();
		}
		return logger;
	}

}
