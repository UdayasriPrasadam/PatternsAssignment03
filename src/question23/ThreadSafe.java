/**
 * 
 */
package question23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Udayasri Prasadam
 *
 */
public class ThreadSafe {
	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass("Hii", 5);
		System.out.println("Old object: " + obj);

		// Create multiple threads to access the object concurrently
		Thread th1 = new Thread(new MyRunnable(obj));
		Thread th2 = new Thread(new MyRunnable(obj));
		th1.start();
		th2.start();
	}

	static class MyRunnable implements Runnable {
		private final ImmutableClass obj;

		MyRunnable(ImmutableClass obj) {
			this.obj = obj;
		}

		public void run() {
			System.out.println("Thread " + Thread.currentThread().getId() + "object: " + obj);
			System.out.println("Thread " + Thread.currentThread().getId() + "modify object...");
			obj.setValue(20); // Try to modify the immutable object
			System.out.println("Thread " + Thread.currentThread().getId() + "execution...");
		}
	}
}

final class ImmutableClass {
	private final String str;
	private final int value;

	public ImmutableClass(String str, int value) {
		this.str = str;
		this.value = value;
	}

	public String getStr() {
		return str;
	}

	public int getValue() {
		return value;
	}

	public ImmutableClass setValue(int newValue) {
		// Note: This method returns a new instance of the class with the updated value
		return new ImmutableClass(str, newValue);
	}

	@Override
	public String toString() {
		return "ImmutableClass [str=" + str + ", value=" + value + "]";
	}
}
