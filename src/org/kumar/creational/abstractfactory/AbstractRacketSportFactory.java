package org.kumar.creational.abstractfactory;

import org.kumar.creational.factory.RacketSport;

public abstract class AbstractRacketSportFactory {
	
	private String name;
	
	public AbstractRacketSportFactory(String name) {
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public abstract RacketSport buildRacket();
}
