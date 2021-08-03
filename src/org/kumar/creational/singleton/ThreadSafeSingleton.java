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
 * for 3rd way, check {@code ThreadSafeSingletonInnerClass}
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

}
