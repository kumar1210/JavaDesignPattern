/**
 * 
 */
package org.kumar.creational.singleton;

import java.io.Serializable;

/**
 * @author gaurkuku
 *
 */
public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5461992393171837047L;

	private SerializedSingleton() {

	}

	private static class SerializedSingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {

		return SerializedSingletonHelper.instance;
	}

	/**
	 * This method is needed to de-serialize the object. readResolve method is a
	 * good practice to achieve pure singleton design pattern where no one can get
	 * another instance by serializing/deserializing.
	 * 
	 * @return
	 */
	protected Object readResolve() {
		return getInstance();
	}
}
