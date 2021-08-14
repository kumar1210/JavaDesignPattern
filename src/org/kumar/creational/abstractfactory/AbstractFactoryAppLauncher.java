/**
 * 
 */
package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.RacketSport;

/**
 * @author gaurkuku
 *
 */
public class AbstractFactoryAppLauncher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AbstractRacketSportFactory badmintonFactory = new BadmintonFactory("BADMINTON");
		
		RacketSport racket = RacketSportFactory.getRacket(badmintonFactory);
		
		System.out.println(racket.toString());
	}

}
