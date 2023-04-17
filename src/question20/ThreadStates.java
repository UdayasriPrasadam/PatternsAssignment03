/**
 * 
 */
package question20;

/**
 * @author Udayasri Prasadam
 *
 */
public class ThreadStates {
		public static void main(String[] args) {
			Thread t1 = new Thread(new MyRunnable());
			Thread t2 = new Thread(new MyRunnable());
			System.out.println("t1 state: " + t1.getState()); 
			System.out.println("t2 state: " + t2.getState()); 
			t1.start();
			t2.start();
			System.out.println("t1 state: " + t1.getState()); 
			System.out.println("t2 state: " + t2.getState()); 
			Thread.yield();
			System.out.println("t1 state: " + t1.getState()); 
			System.out.println("t2 state: " + t2.getState()); 
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t1 state: " + t1.getState()); 
			System.out.println("t2 state: " + t2.getState()); 
			t1.interrupt();
			try {
				t1.join();
				t2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("t1 state: " + t1.getState()); 
			System.out.println("t2 state: " + t2.getState());
		}

}
class MyRunnable implements Runnable {
	@Override
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
}
}
	

