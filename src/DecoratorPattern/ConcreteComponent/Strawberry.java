package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.IceCream;

public class Strawberry implements IceCream {

	@Override
	public Double cost() {
		return 2.0;
	}

}
