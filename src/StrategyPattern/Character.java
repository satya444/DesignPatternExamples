package StrategyPattern;
/**
 * THIS IS THE CONTEXT CLASS REFERRED IN STRATEGY PATTERN
 * @author Dilip
 *
 */
public class Character {

	private Weapon weapon=null;
	
	public void setWeapon(Weapon weapon){
		this.weapon=weapon;
	}
	public void attack(){
		weapon.useWeapon();
	}
	
}
