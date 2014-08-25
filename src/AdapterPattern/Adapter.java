package AdapterPattern;

/**
 * ADAPTER CLASS WHICH IS RESPONSIBLE FOR CONVERTING THE RECEIVED INPUT TO USB
 * 
 * @author Dilip
 * 
 */
public class Adapter {

	Mouse mouse = new Mouse();

	public void convert() {
		mouse.signal();
		System.out.println("Adapter received Signal from mouse");
		System.out.println("converting signal to USB so that cpu understands");
	}
}
