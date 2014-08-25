package IteratorPattern;

public class Twitter implements SocialNetwork {

	String[] users;

	public Twitter() {
		users = new String[] { "pradeep", "ravi", "srinu", "charan",
				"prasanna", "anil" };
	}

	@Override
	public IIterator createIterator() {
		return new TwitterIterator(users);
	}

}
