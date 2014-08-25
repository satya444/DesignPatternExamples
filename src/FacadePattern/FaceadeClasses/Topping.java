package FacadePattern.FaceadeClasses;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Topping {
	Pizza p;

	public Topping(Pizza p) {
		this.p = p;
	}

	List<String> toppings = new LinkedList<String>();
	Cheese cheeseType;

	public void addTopping(List<String> topping) {
		toppings.addAll(topping);
	}

	public void addCheese(Cheese cheeseType) {
		this.cheeseType = cheeseType;
	}

	public void displayToppings() {
		System.out.println("Adding following toppings--");
		Iterator<String> itr = toppings.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
	}
	public List<String> getTopping(){
		return toppings;
	}
}
