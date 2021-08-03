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
public class Badminton extends RacketSport {

	public Badminton(String name) {
		super(name);
	}

	@Override
	public String getBallType() {
		return "Feather";
	}

	@Override
	public String getGameType() {
		return "Indoor Mat";
	}

	@Override
	public String getBatType() {
		return "graphite and nylon string";
	}


}
