/**
 * 
 */
package question17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

/**
 * @author Udayasri Prasadam
 *
 */
public class Fail {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		for(Integer in : list) {
			if (in == 3) {
				list.remove(Integer.valueOf(in)); 
			}
		}
        System.out.println(list);
		/* Fail-Safe Iterator example
		Map<Integer, Integer> m = new ConcurrentHashMap<>();
		map.put(1, 9);
		map.put(2, 8);
		map.put(3, 7);
		Iterator<Integer> mitr = map.keySet().iterator();
		while (mitr.hasNext()) {
			int k = mitr.next();
			if (k == 3) {
				map.put(4, 4); 
			}
		} 
           */
	}

}
