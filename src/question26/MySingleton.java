/**
 * 
 */
package question26;

/**
 * @author Udayasri Prasadam
 *
 */
public  class MySingleton {
	private static final MySingleton instance = new MySingleton();

	private MySingleton() {
		System.out.println("Creating a MySingleton instance.");
	}

	public static MySingleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("This is a MySingleton object.");
	}

	public static void main(String[] args) {
		MySingleton ob1 = MySingleton.getInstance();
		MySingleton ob2 = MySingleton.getInstance();

		System.out.println("first hash code: " + ob1.hashCode());
		System.out.println("second hash code: " + ob2.hashCode());

		ob1.showMessage();
	}

}


