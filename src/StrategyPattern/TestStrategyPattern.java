package StrategyPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestStrategyPattern {
	public static void main(String args[]) throws IOException {
		Weapon weapon=null;
		Character c = new Character();
		while (true) {
			System.out.println("Enter which weapon to use");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			Integer input = br.read()-48;
			System.out.println(input);
			switch (input) {
			case 1:
				weapon = new Axe();
				break;
			case 2:
				weapon = new Club();
				break;
			case 3:
				weapon = new Sword();
				break;
			}
			c.setWeapon(weapon);
			c.attack();
		}
	}
}
