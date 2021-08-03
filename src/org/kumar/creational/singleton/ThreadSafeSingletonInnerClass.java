/**
 * 
 */
package org.kumar.creational.singleton;

/**
 * 
 * This is another way of implementing thread safe singleton like
 * {@code ThreadSafeSingleton} using the Inner class.
 * 
 * @author gaurkuku
 *
 */
public class ThreadSafeSingletonInnerClass {

	private ThreadSafeSingletonInnerClass() {

	}

	/**
	 * 
	 * The {@code ThreadSafeSingletonHelper} private inner static class that
	 * contains the instance of the singleton class. When the singleton class is
	 * loaded, SingletonHelper class is not loaded into memory and only when someone
	 * calls the {@link #getInstance()} method, this class gets loaded and creates
	 * the Singleton class instance.
	 * 
	 * Since the class initialization phase is guaranteed by the JLS to be serial,
	 * i.e., non-concurrent, no further synchronization is required in the static
	 * getInstance method during loading and initialization. The class
	 * initialization phase is continuous, that is, non-concurrent.
	 * 
	 * @author gaurkuku
	 *
	 */
	private static class ThreadSafeSingletonHelper {
		private static final ThreadSafeSingletonInnerClass INSTANCE = new ThreadSafeSingletonInnerClass();
	}

	public static ThreadSafeSingletonInnerClass getInstance() {
		return ThreadSafeSingletonHelper.INSTANCE;
	}
}
