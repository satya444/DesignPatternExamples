package ObserverPattern;

public class ModeratorSubscriber implements ISubscriber {

	private String name;

	@Override
	public void notifyMe() {

		System.out.println("Moderator Notified");
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
