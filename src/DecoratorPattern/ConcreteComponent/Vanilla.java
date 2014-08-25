package DecoratorPattern.ConcreteComponent;

import DecoratorPattern.Component.IceCream;

public class Vanilla implements IceCream{

	@Override
	public Double cost() {
		
		return 1.0;
	}

}
