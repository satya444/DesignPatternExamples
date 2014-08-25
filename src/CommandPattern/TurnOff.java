package CommandPattern;

public class TurnOff implements Command{

	ElectronicDevice ed;
	public TurnOff(ElectronicDevice ed) {
		this.ed=ed;
	}
	@Override
	public void execute() {
		ed.off();
		
	}

	
}
