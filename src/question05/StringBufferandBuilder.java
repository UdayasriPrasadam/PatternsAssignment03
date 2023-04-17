/**
 * 
 */
package question05;

/**
 * @author Udayasri Prasadam
 *
 */
public class StringBufferandBuilder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  StringBuffer s = new StringBuffer();
	        s.append("Hello");
	        s.append(" ");
	        s.append("Java");
	        String r1 = s.toString();
	        System.out.println("StringBuffer results are: " + r1);

	        
	        StringBuilder s1 = new StringBuilder();
	        s1.append("Hello");
	        s1.append(" ");
	        s1.append("Java");
	        String r2 = s1.toString();
	        System.out.println("StringBuilder results are: " + r2);

	}

}
