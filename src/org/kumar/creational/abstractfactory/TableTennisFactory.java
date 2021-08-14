/**
 * 
 */
package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.RacketSport;
import org.kumar.creational.factory.TableTennis;

/**
 * @author gaurkuku
 *
 */
public class TableTennisFactory extends AbstractRacketSportFactory {

	public TableTennisFactory(String name) {
		super(name);
	}

	@Override
	public RacketSport buildRacket() {
		return new TableTennis(this.getName());
	}

}
