package CommandPattern;

public class TurnOn implements Command{

	ElectronicDevice ed;
	public TurnOn(ElectronicDevice ed) {
		this.ed=ed;
	}
	@Override
	public void execute() {
		ed.on();
		
	}

}
