/**
 * 
 */
package question06;

/**
 * @author Udayasri Prasadam
 *
 */
public class StringClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String s = "Hellon ";
	        s += "Java";
	        System.out.println("String " + s);

	        
	        StringBuffer sb = new StringBuffer();
	        sb.append("Hello");
	        sb.append("Java");
	        String r = sb.toString();
	        System.out.println("StringBuffer " + r);

	}

}
