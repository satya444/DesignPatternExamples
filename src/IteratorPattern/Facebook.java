package IteratorPattern;

import java.util.LinkedList;
import java.util.List;

public class Facebook implements SocialNetwork{

	List<String> users= new LinkedList<String>();
	
	public Facebook() {
		users.add("satya");
		users.add("raghava");
		users.add("dilip");
		users.add("bhattiprolu");
	}
	@Override
	public IIterator createIterator() {
		
		return new FacebookIterator(users);
	}

}
