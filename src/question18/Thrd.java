/**
 * 
 */
package question18;

/**
 * @author Udayasri Prasadam
 *
 */
public class Thrd extends Thread{

	public void run() {
	     System.out.println("Thread in this class Started");
		}
 public static void main(String args[]) {
	Thrd t = new Thrd();
	t.start();
	t.start();
					
    }

}
