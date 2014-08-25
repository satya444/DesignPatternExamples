package IteratorPattern;

import java.util.List;

/**
 * LET FACEBOOK USE A LINKEDLIST OF USERS.
 * 
 * @author Dilip
 * 
 */
public class FacebookIterator implements IIterator {

	List<String> users;
	int position;

	public FacebookIterator(List<String> users) {
		this.users = users;
		position = 0;
	}

	@Override
	public String first() {

		return users.get(0);
	}

	@Override
	public boolean isDone() {
		if (position == users.size()) {
			return true;
		}
		return false;
	}

	@Override
	public String getCurrentElement() {
		return users.get(position);
	}

	@Override
	public String next() {
		String currUser = getCurrentElement();
		position = position + 1;
		return currUser;
	}

}
