package DecoratorPattern;

import DecoratorPattern.Component.IceCream;
import DecoratorPattern.ConcreteComponent.Strawberry;
import DecoratorPattern.ConcreteDecorator.ChocChips;
import DecoratorPattern.ConcreteDecorator.Gems;

/**
 * THIS PROGRAM WORKS RECURSIVELY FOR COMPUTING THE TOTAL COST OF ICECREAM
 * 
 * @author Dilip
 * 
 */
public class TestProgram {
	public static void main(String args[]) {
		IceCream icecream = new Strawberry();
		icecream = new ChocChips(icecream);
		icecream = new Gems(icecream);
		System.out.println(icecream.cost());
	}

}
