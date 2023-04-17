/**
 * 
 */
package question13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @author Udayasri Prasadam
 *
 */
public class AstractAndVector {

	
	    public static void main(String[] args) {
	       
	        List<String> list = new Vector<>();
	        list.add("uday");
	        list.add("sobha");
	        list.add("mini");
	       
	        List<String> list2 = new ArrayList<>();
	        list2.add("vysh");
	        list2.add("moni");
	        list2.add("Anju");
	        
	        for (String name : list) {
	            System.out.println(name);
	        }
	        
	        for (String name : list2) {
	            System.out.println(name);
	        }
	    }
	}



