/**
 * 
 */
package question09;

import java.util.Scanner;

/**
 * @author Udayasri Prasadam
 *
 */
public class TryResource {

	/**
	 * @param args
	 */
	
	public static int name(int n) {
		int a = 8;
		return a/0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner s  = new Scanner(System.in)) {
			    // Execute code that uses the resources
			System.out.println("Enter a number");
			int n = s.nextInt();
			System.out.println(name(n));

			} catch (ArithmeticException e) {
			    System.out.println("Found exception"+e);
			}

	}

}
