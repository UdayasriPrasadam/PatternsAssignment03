/**
 * 
 */
package question15;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author Udayasri Prasadam
 *
 */
public class Hashmap {

	    public static void main(String[] args) {
	        Hashtable<Integer, String> hashtable = new Hashtable<>();
	        hashtable.put(1, "Uday");
	        hashtable.put(2, "Mouni");
	        hashtable.put(3, "Sobha");
	        HashMap<Integer, String> hashmap = new HashMap<>();
	        hashmap.put(1, "Anju");
	        hashmap.put(2, "Vysh");
	        hashmap.put(3, "Cherry");
	        System.out.println("Hashtable:");
	        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	        System.out.println("HashMap:");
	        for (Map.Entry<Integer, String> entry : hashmap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }
	    }
	}



