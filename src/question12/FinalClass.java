/**
 * 
 */
package question12;

/**
 * @author Udayasri Prasadam
 *
 */
public class FinalClass {

	public final int div() {
		return 10/5 ;
	}
	
	public static void main(String args[]) throws Throwable {
		final double m = 3;
		FinalClass s = new FinalClass();
		try {
		System.out.println(s.div());
		s.finalize();
		double s1 = m/0;
		}
		catch(Exception e){
			System.out.println(" Exception is "+e);
		}
		finally {
			
			System.out.println("Finally Block Executed Successfully");
		}
		
	}
	
	
	

}
