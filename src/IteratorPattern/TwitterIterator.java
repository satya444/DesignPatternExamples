package IteratorPattern;

/**
 * LET TWITTER MAINTAIN AN ARRAY OF USERS
 * 
 * @author Dilip
 * 
 */
public class TwitterIterator implements IIterator {

	String[] users;
	int position;

	public TwitterIterator(String[] users) {
		this.users = users;
		this.position = 0;
	}

	@Override
	public String first() {
		return users[0];
	}

	@Override
	public boolean isDone() {
		if (position == users.length) {
			return true;
		}
		return false;
	}

	@Override
	public String getCurrentElement() {

		return users[position];
	}

	@Override
	public String next() {
		String ele = getCurrentElement();
		position = position + 1;
		return ele;
	}

}
