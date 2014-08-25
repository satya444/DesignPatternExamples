package StrategyPattern;
/**
 * In this pattern behavoir chages according to algorithm which changes in runtime.
 * THIS IS THE STRATEGY INTERFACE
 * @author Dilip
 *
 */
public interface Weapon {
	/**
	 * Algorithm in this example refers to kind of weapon being used which user keeps changing
	 * 
	 */
	public void useWeapon();
}
