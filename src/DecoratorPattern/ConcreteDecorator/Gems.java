package DecoratorPattern.ConcreteDecorator;

import DecoratorPattern.Component.IceCream;
import DecoratorPattern.Decorator.Toppings;

public class Gems extends Toppings {

	private IceCream icecream;

	public Gems(IceCream icecream) {
		this.icecream = icecream;
	}

	@Override
	public Double cost() {

		return 5.0 + icecream.cost();
	}

}
