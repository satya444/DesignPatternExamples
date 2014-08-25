package ObserverPattern;

/**
 * THERE CAN BE DIFFERENT TYPES OF SUBSCRIBERS. GENERAL SUBSCRIBERS WHO USE
 * YOUTUBE, MODERATORS WHO REVIEW CHANGES IN YOUTUBE AND MANY MORE. SO WE
 * DECLARE ISUBSCRIBER INTERFACE
 * 
 * @author Dilip
 * 
 */
public interface ISubscriber {

	public void setName(String name);
	public String getName();
	public void notifyMe();
}
