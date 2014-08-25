package DecoratorPattern.Decorator;

import DecoratorPattern.Component.IceCream;

/**
 * TOPPING IS AN ABSTRACT CLASS WHICH IS EXTENDED BY TOPPINGS LIKE CHOCCHIPS.
 * REFER CHOCCHIPS FOR DETAILS
 * 
 * @author Dilip
 * 
 */
public abstract class Toppings implements IceCream {

	private IceCream icecream;

	public IceCream getIcecream() {
		return icecream;
	}

	public void setIcecream(IceCream icecream) {
		this.icecream = icecream;
	}

}
