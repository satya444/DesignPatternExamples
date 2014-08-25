package DecoratorPattern.ConcreteDecorator;

import DecoratorPattern.Component.IceCream;
import DecoratorPattern.Decorator.Toppings;

/**
 * THIS IS ONE OF THE CLASSES THAT EXTENDS ABSTRACT CLASS TOPPINGS. THESE TAKES
 * ICECREAM AS INPUT PARAMETER TO THE CONSTRUCTOR. SO WHILE ADDING THE NEW COST
 * IT ADDS COST TO THE OLD ICECREAM COST.
 * 
 * @author Dilip
 * 
 */
public class ChocChips extends Toppings {

	private IceCream icecream;

	public ChocChips(IceCream icecream) {
		this.icecream = icecream;
	}

	/**
	 * This is a recursive method which adds the new cost to the old cost. These
	 * are Recursive calls.
	 */
	@Override
	public Double cost() {
		return 1.0 + icecream.cost();
	}

}
