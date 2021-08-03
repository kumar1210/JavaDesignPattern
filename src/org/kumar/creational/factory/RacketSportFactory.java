/**
 * 
 */
package org.kumar.creational.factory;

/**
 * This is a factory class of the RacketSport, which basically returns the type
 * of racket based on the type asked.
 * 
 * @author gaurkuku
 *
 */
public class RacketSportFactory {

	public static final String BADMINTON = "Badminton";
	public static final String LAWN_TENNIS = "Lawn Tennis";
	public static final String TABLE_TENNIS = "Table Tennis";

	public static RacketSport getRacket(String type) {
		if (BADMINTON.equalsIgnoreCase(type)) {
			return new Badminton(BADMINTON);
		} else if (LAWN_TENNIS.equalsIgnoreCase(type)) {
			return new LawnTennis(LAWN_TENNIS);
		} else if (TABLE_TENNIS.equalsIgnoreCase(type)) {
			return new TableTennis(TABLE_TENNIS);
		}
		return null;
	}

}
