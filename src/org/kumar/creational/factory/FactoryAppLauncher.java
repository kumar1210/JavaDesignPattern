/**
 * 
 */
package org.kumar.creational.factory;

/**
 * @author gaurkuku
 *
 */
public class FactoryAppLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		RacketSport badminton = RacketSportFactory.getRacket("Badminton");
		System.out.println(badminton.toString());
		
		RacketSport lawnTennis = RacketSportFactory.getRacket("Lawn Tennis");
		System.out.println(lawnTennis.toString());
		
		RacketSport tableTennis = RacketSportFactory.getRacket("Table Tennis");
		System.out.println(tableTennis.toString());
	}

}
