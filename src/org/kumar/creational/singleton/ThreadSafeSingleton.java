package org.kumar.creational.singleton;

/**
 * The class {@code ThreadSafeSingleton} is one of the approach of the
 * implementation of Singleton Design Pattern. This is another way of
 * implementing {@link LazyInitializedSingleton} but compatible to
 * multi-threaded environment.
 * 
 * 
 * This class implements three ways to achieve the thread-safe singleton.
 * 
 * {@link #getInstanceWithSynchronizedMethod()} - very costly, as the
 * synchronized on static method, whole class will be locked.
 * 
 * {@link #getInstanceWithSynchronizedBlock()} - better than method level
 * synchronization and less overhead.
 * 
 * {@link #getInstanceWithNestedClass() ThreadSafeSingletonHelper} - this is
 * better and cleaner code then the synchronize block
 * 
 * 
 * @author gaurkuku
 *
 */

public class ThreadSafeSingleton {

	private static ThreadSafeSingleton instanceObj;

	private ThreadSafeSingleton() {

	}

	/**
	 * This implementation works fine and provides thread-safety but it reduces the
	 * performance because of the cost associated with the synchronized method.
	 * Since the synchronized is used over a static method, the whole class will be
	 * locked.
	 * 
	 * 
	 * @return
	 */
	public static synchronized ThreadSafeSingleton getInstanceWithSynchronizedMethod() {

		if (null == instanceObj) {
			instanceObj = new ThreadSafeSingleton();
		}
		return instanceObj;
	}

	/**
	 * To avoid the overhead of getInstanceWithSynchronizedMethod(), we use double
	 * check locking principle. the synchronized block is used inside the if
	 * condition with an additional check to ensure that only one instance of a
	 * singleton class is created.
	 * 
	 * @return
	 */
	public static ThreadSafeSingleton getInstanceWithSynchronizedBlock() {

		if (null == instanceObj) {
			synchronized (ThreadSafeSingleton.class) {
				if (null == instanceObj) {
					instanceObj = new ThreadSafeSingleton();
				}
			}
		}
		return instanceObj;
	}

	/**
	 * 
	 * The {@code ThreadSafeSingletonHelper} private inner static class that
	 * contains the instance of the singleton class. When the singleton class is
	 * loaded, SingletonHelper class is not loaded into memory and only when someone
	 * calls the getInstance method, this class gets loaded and creates the
	 * Singleton class instance.
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
		private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
	}

	public static ThreadSafeSingleton getInstanceWithNestedClass() {
		return ThreadSafeSingletonHelper.INSTANCE;
	}

}
