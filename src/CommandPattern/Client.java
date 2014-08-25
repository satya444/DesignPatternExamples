package CommandPattern;

public class Client {

	public static void main(String args[]){
		ElectronicDevice ed= new Television();
		Command command= new TurnOn(ed);
		Remote remote= Remote.getRemote();
		remote.press(command);
		command= new TurnOff(ed);
		remote.press(command);

	}
}
