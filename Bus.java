/*
 * The bus class extends the Vehicle class
 */
public class Bus extends Vehicle {

	private int passengerLimit; // gives the maximum passenger limit of the bus
	private String busType; // tells whether the bus is an articulated type or other
	
	public Bus(int y, String m, String ml, String c, int pl, String bt) {
		super(y, m, ml, c); 
		passengerLimit = pl;
		busType = bt;
	}
	
	/*
	 * Getter method for passenger information
	 */
	public int getPassengerLimit() {
		return passengerLimit;
	}
	
	/*
	 * Getter method for bus information
	 */
	public String getBusType() {
		return busType;
	}
	
	/*
	 * Setter method for passenger information
	 */
	public void setPassengerLimit(int pl) {
		passengerLimit = pl;
	}
	
	/*
	 * Setter method for bus information
	 */
	public void setBusType(String bt) {
		busType = bt;
	}
	
}
