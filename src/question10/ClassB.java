/**
 * 
 */
package question10;

import java.io.FileNotFoundException;

/**
 * @author Udayasri Prasadam
 *
 */
public class ClassB extends ClassA {

	public void doSomething() throws FileNotFoundException {
		System.out.println("This is in ClassB");
        
    }
	public static void main(String args[]) {
		ClassB s = new ClassB();
		try {
			s.doSomething();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}








