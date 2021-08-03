/**
 * 
 */
package org.kumar.creational.singleton;

/**
 * The class {@code StaticBlockSingleton} is one of the approach of the
 * implementation of Singleton Design Pattern. But this can be overhead, if we
 * are using this implementation for a heavy object like File handling, DB
 * connection, those will get initiated even if we don't use it.
 * 
 * <p>
 * It's similar to EagerInitialization, only difference is it provides Exception
 * handling.
 * 
 * <h3>static block gets executed first and only once when the class will be
 * loaded into memory</h3>
 * 
 * @author gaurkuku
 *
 */
public class StaticBlockSingleton {

	private static StaticBlockSingleton instanceObj = null;

	private StaticBlockSingleton() {

	}

	static {
		try {
			instanceObj = new StaticBlockSingleton();
		} catch (Exception ex) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingleton getInstance() throws Exception {

		if (null == instanceObj) {
			throw new Exception("Eager Initialization of singleton failed");
		}

		return instanceObj;
	}

}
