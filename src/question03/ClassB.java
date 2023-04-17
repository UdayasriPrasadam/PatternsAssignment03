/**
 * 
 */
package question03;

/**
 * @author Udayasri Prasadam
 *
 */
public class ClassB extends ClassA {

	 @Override
	    public ClassB doSomething() {
		 System.out.println("This is SubClass");
	        return new ClassB();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassB s  = new ClassB();
		ClassA a =  s.doSomething();
		System.out.println(a.getClass());

	}

}
