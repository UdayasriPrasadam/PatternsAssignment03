/**
 * 
 */
package question27;

/**
 * @author Udayasri Prasadam
 *
 */
public class Student { 

	private static Student instance;

	private Student() {}

	public static synchronized Student getInstance() {
		if (instance == null) {
			System.out.println("instance of SingletonSyncDemo");
			instance = new Student();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hii, java!");
	}

	public static void main(String[] args) {
		System.out.println("instance of SingletonSyncDemo");
		Student ob1 = Student.getInstance();

		System.out.println("instance of SingletonSyncDemo again");
		Student ob2 = Student.getInstance();

		System.out.println("instances equal? " + (ob1 == ob2));

		System.out.println("showMessage method on object1");
		ob1.showMessage();

		System.out.println("showMessage method on object2");
		ob2.showMessage();
	}

	}


