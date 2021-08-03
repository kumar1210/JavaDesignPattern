/**
 * 
 */
package org.kumar.creational.factory;

/**
 * One of the child class of {@code RacketSport} <b> Class can have their own
 * new methods and instance variables as per the requirement
 * 
 * @author gaurkuku
 *
 */
public class LawnTennis extends RacketSport {

	public LawnTennis(String name) {
		super(name);
	}

	@Override
	public String getBallType() {
		return "Rubber ball";
	}

	@Override
	public String getGameType() {
		return "Outdoor Grass";
	}

	@Override
	public String getBatType() {
		return "graphite and nylon string";
	}

}
