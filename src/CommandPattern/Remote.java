package CommandPattern;

public class Remote {

	public void press(Command command){
		command.execute();
	}
	public static Remote getRemote(){
		return new Remote();
	}
	
}
