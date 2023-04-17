/**
 * 
 */
package question21;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author Udayasri Prasadam
 *
 */
public class Serial implements Serializable {
	    private String name;
	    private int age;
	    private double salary;

	    public Serial(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    public static void main(String[] args) throws Exception {
	    	Serial emp1 = new Serial("John", 10, 9000.0);

	        // Serialization
	        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("employee.ser"));
	        out.writeObject(emp1);
	        out.close();

	        // Deserialization
	        ObjectInputStream in = new ObjectInputStream(new FileInputStream("employee.ser"));
	        Serial emp2 = (Serial) in.readObject();
	        in.close();

	        System.out.println("Name: " + emp2.name);
	        System.out.println("Age: " + emp2.age);
	        System.out.println("Salary: " + emp2.salary);
	    }
	}

