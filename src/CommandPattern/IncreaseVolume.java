package CommandPattern;

public class IncreaseVolume implements Command {

	ElectronicDevice ed;
	 public IncreaseVolume(ElectronicDevice ed) {
		this.ed=ed;
	}
	@Override
	public void execute() {
		ed.up();
	}

}
