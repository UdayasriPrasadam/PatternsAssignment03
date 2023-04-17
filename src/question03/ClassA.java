/**
 * 
 */
package question03;

/**
 * @author Udayasri Prasadam
 *
 */
public class ClassA {
	
	 public ClassA doSomething() {
		 System.out.println("This is superClass");
	        return new ClassA();
	    }

}
