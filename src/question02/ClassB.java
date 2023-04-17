/**
 * 
 */
package question02;

/**
 * @author Udayasri Prasadam
 *
 */
public class ClassB extends ClassA {
  
//	@Override
//	private void methodA() {
//		System.out.println("methodA in class A");
//	}

	@Override
	void methodB() {
		System.out.println("methodB in class B");
	}

	@Override
	protected void methodC() {
		System.out.println("methodC in class B");
	}

//	@Override
//	public void methodD() {
//		System.out.println("methodD in class B");
//	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassA s = new ClassB();
		s.methodB();
		s.methodC();
		s.methodD();

	}

}
