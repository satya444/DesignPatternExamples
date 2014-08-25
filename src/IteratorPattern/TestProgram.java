package IteratorPattern;

public class TestProgram {

	public static void main(String args[]) {
		SocialNetwork s1 = new Facebook();
		SocialNetwork s2 = new Twitter();
		IIterator itr1 = s1.createIterator();
		IIterator itr2 = s2.createIterator();

		while (!itr1.isDone()) {
			System.out.println(itr1.next());
		}
		System.out.println("****--------------****");
		while (!itr2.isDone()) {
			System.out.println(itr2.next());
		}

	}
}
