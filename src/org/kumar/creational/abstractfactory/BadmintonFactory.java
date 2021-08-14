package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.Badminton;
import org.kumar.creational.factory.RacketSport;

public class BadmintonFactory extends AbstractRacketSportFactory {

	public BadmintonFactory(String name) {
		super(name);
	}

	@Override
	public RacketSport buildRacket() {
		return new Badminton(this.getName());
	}

}
