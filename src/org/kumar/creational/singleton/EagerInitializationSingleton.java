package org.kumar.creational.singleton;

/***
 * 
 * The class {@code EagerInitializationSP} is one of the approach of the
 * implementation of Singleton Design Pattern. But this can be overhead, if we
 * are using this implementation for a heavy object like File handling, DB
 * connection, those will get initiated even if we don't use it.
 * 
 * <p>
 * Also, this method doesn’t provide any options for exception handling.
 * 
 * 
 * @author gaurkuku
 */

public class EagerInitializationSingleton {

	private static EagerInitializationSingleton instanceObj = new EagerInitializationSingleton();

	private EagerInitializationSingleton() {
		// TODO : Any logic needed.
	}

	public static EagerInitializationSingleton getInstanceObj() throws Exception {

		if (null == instanceObj) {
			throw new Exception("Eager Initialization of singleton failed");
		}

		return instanceObj;
	}

}
