/**
 * 
 */
package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.RacketSport;

/**
 * @author gaurkuku
 *
 */
public class RacketSportFactory {
	
	public static RacketSport getRacket(AbstractRacketSportFactory sportFactory) {
		return sportFactory.buildRacket();
	}

}
