package ObserverPattern;

public class GenSubscriber implements ISubscriber {

	private String name;
	@Override
	public void notifyMe() {
		System.out.println("General user Notified");
	}

	@Override
	public void setName(String name) {
		this.name=name;
	}

	@Override
	public String getName() {
		return this.name;
	}

}
