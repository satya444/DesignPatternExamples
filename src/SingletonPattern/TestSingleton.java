package SingletonPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestSingleton {
	public static void main(String args[]) throws IOException {
		Singleton logger= Singleton.getInstance();
		while(true){
			System.out.println("Enter message to logger");
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			String message= br.readLine();
			logger.writeLog(message);
			
		}
	}
}
