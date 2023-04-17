/**
 * 
 */
package question19;

/**
 * @author Udayasri Prasadam
 *
 */
public class ThreadDemo2 extends Thread{

	public void run() {
		System.out.println("Thread created from extending Thread ");
		}

	public static void main(String args[]) {
		ThreadDemo2 d = new ThreadDemo2();
		d.start();
		ThreadDemo r = new ThreadDemo();
		Thread d1 = new Thread(r);
		d1.start();
	}


}
