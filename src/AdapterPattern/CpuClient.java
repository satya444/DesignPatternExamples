package AdapterPattern;

public class CpuClient {

	public static void main(String args[]){
		Adapter adapter= new Adapter();
		adapter.convert();
		System.out.println("Received input from USB");
	}
}
