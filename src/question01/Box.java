/**
 * 
 */
package question01;

/**
 * @author Udayasri Prasadam
 *
 */
public class Box<U> {
	
	 private U valv;

	    public U getValv() {
	        return valv;
	    }

	    public void setValue(U valv) {
	        this.valv = valv;
	    }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box = new Box<>();
		box.setValue("Hello, World!");
		String value = box.getValv();
		System.out.println(value);

	}

}
