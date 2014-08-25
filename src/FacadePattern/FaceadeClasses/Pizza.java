package FacadePattern.FaceadeClasses;

import java.util.List;

public class Pizza {

	public void makeDough(){
		System.out.println("Dough prepare initiated");
	}
	public List<String> printToppings(Topping topping){
		return topping.getTopping();
	}
	public String getCheese(Cheese cheese){
		return cheese.getCheeseType();
	}
	public int getTemp(Oven oven){
		return oven.getTemperature();
	}
	
}
