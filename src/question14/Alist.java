/**
 * 
 */
package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Udayasri Prasadam
 *
 */
public class Alist {

	public static void main(String[] args) {
		
		List<String> ls = new ArrayList<>();
		ls.add("Uday");
		ls.add("Mini");
		ls.add("Sobh");
		ls.add("Mouni");
		List<String> syncList = Collections.synchronizedList(ls);
		synchronized (syncList) {
			System.out.println("Size of synchronized list is: " + syncList.size());
		}
		synchronized (syncList) {
			syncList.add("Anju");
			syncList.add("Cherry");
		}
		synchronized (syncList) {
			System.out.println("Synchronized list is: " + syncList);
		}
	}

}
