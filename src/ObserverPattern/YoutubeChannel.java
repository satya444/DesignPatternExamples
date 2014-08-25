package ObserverPattern;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * YOUTUBE IS AN EXAMPLE OF OBSERVERPATTERN SUBJECT. MANY DIFFERENT KINDS OF
 * USERS WILL BE SUBCRIBING TO YOUTUBE CHANNEL
 * 
 * @author Dilip
 * 
 */
public class YoutubeChannel {

	private List<ISubscriber> subscribers = new LinkedList<ISubscriber>();

	public void register(ISubscriber s) {
		subscribers.add(s);
	}

	public void unRegister(ISubscriber s) {
		subscribers.remove(s);
	}

	public void notifyAllSubscribers() {
		Iterator<ISubscriber> itr = subscribers.iterator();
		while (itr.hasNext()) {
			ISubscriber s = itr.next();
			System.out.println(s.getName());
			s.notifyMe();
		}
	}
}
