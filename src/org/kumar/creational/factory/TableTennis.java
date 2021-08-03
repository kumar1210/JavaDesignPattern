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
public class TableTennis extends RacketSport {

	public TableTennis(String name) {
		super(name);
	}

	@Override
	public String getBallType() {
		return "Plastic ball";
	}

	@Override
	public String getGameType() {
		return "Indoor table";
	}

	@Override
	public String getBatType() {
		return "Wood and Rubber";
	}

}
