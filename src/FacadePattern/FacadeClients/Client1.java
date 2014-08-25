package FacadePattern.FacadeClients;

import java.util.LinkedList;
import java.util.List;

import FacadePattern.Facade.MakePizza;

public class Client1 {

	public static void main(String args[]){
		List<String> toppings= new LinkedList<>();
		toppings.add("1");
		toppings.add("2");
		toppings.add("3");
		MakePizza mp= new MakePizza(toppings, "cheese1");
		mp.prepare();
		
	}
}
