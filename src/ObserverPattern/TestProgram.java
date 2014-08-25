package ObserverPattern;

public class TestProgram {

	public static void main(String args[]){
		ISubscriber s1= new GenSubscriber();
		s1.setName("satya");
		ISubscriber s2= new GenSubscriber();
		s2.setName("raghava");
		ISubscriber s3= new ModeratorSubscriber();
		s3.setName("dilip");
		ISubscriber s4= new ModeratorSubscriber();
		s4.setName("bhattiprolu");
		YoutubeChannel y= new YoutubeChannel();
		y.register(s1);
		y.register(s2);
		y.register(s3);
		y.register(s4);
		y.notifyAllSubscribers();
		System.out.println("******-------------******");
		y.unRegister(s2);
		y.unRegister(s3);
		y.notifyAllSubscribers();
	}
}
