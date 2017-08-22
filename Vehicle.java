/**
 * Superclass or parent class
 * @author Dylan Decker
 *
 */

public class Vehicle {
	
	private int year; // year of vehicle
	private String make; // vehicle manufacturer
	private String model; // model of vehicle
	private String color;  // color of vehicle
	
	public Vehicle(int y, String m, String ml, String c) {
		year = y;
		make = m;
		model = ml;
		color = c;
	}
	
	/*
	 * Getter methods for the class
	 */
	
	public int getYear() {
		return year;
	}
	
	public String getMake() {
		return make;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getColor() {
		return color;
	}
	
	/*
	 * This method prints out some general information about the vehicle
	 */
	public void getVehicleInfo() {
		System.out.println("The " + year + " " + make + " " + model + " is offered in " + color + ".");
	}

}
