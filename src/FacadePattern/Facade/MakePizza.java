package FacadePattern.Facade;

import java.util.List;

import FacadePattern.FaceadeClasses.Cheese;
import FacadePattern.FaceadeClasses.Oven;
import FacadePattern.FaceadeClasses.Pizza;
import FacadePattern.FaceadeClasses.Topping;

public class MakePizza {

	List<String> topping;
	String cheeseType;
	/**
	 * 
	 * @param topping--pass a List<String> toppings
	 * @param cheese--pass the kind of cheese required
	 * 
	 */
	public MakePizza(List<String> topping, String cheeseType){
		this.topping=topping;
		this.cheeseType=cheeseType;
	}
	public void prepare(){
		Pizza pizza = new Pizza();
		Topping pizzaTopping= new Topping(pizza);
		pizzaTopping.addTopping(topping);
		Cheese cheese= new Cheese();
		cheese.setCheeseType(cheeseType);
		Oven oven= new Oven();
		oven.onOven();
		oven.setTemperature(400);
		oven.offOven();
		System.out.println(pizza.getCheese(cheese));
		System.out.println(pizza.printToppings(pizzaTopping));
		
		
	}
	
}
