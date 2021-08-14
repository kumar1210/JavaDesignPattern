/**
 * 
 */
package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.LawnTennis;
import org.kumar.creational.factory.RacketSport;

/**
 * @author gaurkuku
 *
 */
public class LawnTennisFactory extends AbstractRacketSportFactory {

	public LawnTennisFactory(String name) {
		super(name);
	}

	@Override
	public RacketSport buildRacket() {
		return new LawnTennis(this.getName());
	}

}
