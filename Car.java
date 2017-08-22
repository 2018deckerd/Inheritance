/**
 * The Car class extends the Vehicle superclass
 * @author Dylan Decker
 *
 */
public class Car extends Vehicle {
	
	/*
	 * The Car class inherits all of the fields of the Vehicle
	 * class along with extra information displayed below.
	 */
	private int height;
	private int length;
	
	public Car(int y, String m, String ml, String c, int h, int l) {
		/*
		 * Calls constructor of parent class
		 */
		super(y, m, ml, c);
		/*
		 * Sets up the new instance variables for this class
		 */
		height = h;
		length = l;
	}
	
	/*
	 * Accessor methods for the created instance variables
	 */
	public int getCarHeight() {
		return height;
	}
	
	public int getCarLength() {
		return length;
	}
	
	/*
	 * setter methods for the created instance variables
	 */
	public void setCarHeight(int h) {
		height = h;
	}
	
	public void setCarLength(int l) {
		length = l;
	}

}
