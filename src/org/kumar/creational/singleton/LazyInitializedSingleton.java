/**
 * 
 */
package org.kumar.creational.singleton;

/**
 * The class {@code LazyInitializedSingleton} is one of the approach of the
 * implementation of Singleton Design Pattern. This is better than then the
 * {@code EagerInitializationSingleton, StaticBlockSingleton} as it creates the
 * instances when the user actually needs it.
 * 
 * This works fine in single threaded, but can cause issues if multiple threads
 * are inside the if condition at the same time. Check for
 * {@code ThreadSafeSingleton} for multi-threaded environments.
 * 
 * @author gaurkuku
 *
 */
public class LazyInitializedSingleton {

	private static LazyInitializedSingleton instanceObj = null;

	private LazyInitializedSingleton() {

	}

	public static LazyInitializedSingleton getInstance(String val) {

		if (null == instanceObj) {
			instanceObj = new LazyInitializedSingleton();
		}
		return instanceObj;
	}

}
