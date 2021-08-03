/**
 * 
 */
package org.kumar.creational.factory;

/**
 * The base class of the RacketSport
 * 
 * @author gaurkuku
 *
 */
public abstract class RacketSport {

	private String sportName;

	public RacketSport(String name) {
		this.sportName = name;
	}

	public abstract String getBallType();

	public abstract String getGameType();

	public abstract String getBatType();

	public String getSportName() {
		return sportName;
	}

	@Override
	public String toString() {

		return getSportName() + " = gameType : " + getGameType() + ", Bat Material : " + getBatType()
				+ ", Ball Material : " + getBallType();
	}

}
