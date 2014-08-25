package CommandPattern;

public class Television implements ElectronicDevice{

	private int volume;
	@Override
	public void on() {
		System.out.println("tv is on");
	}

	@Override
	public void off() {
		System.out.println("tv is off");
	}

	@Override
	public void up() {
		volume++;
		System.out.println("increased volume to -- "+volume);
	}

	@Override
	public void down() {
		volume--;
		System.out.println("decreased volume to -- "+volume);
	}

}
