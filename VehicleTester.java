/**
 * Class to test functionality of the classes
 * @author Dylan Decker
 *
 */
public class VehicleTester {
	public static void main(String[] args) {
		
	/*
	* Create a few new buses, cars and vehicles
	*/
	Vehicle veh1 = new Vehicle(2015, "Peterbilt", "579", "Red");
	Vehicle veh2 = new Vehicle(2016, "Renault", "Maxispace", "Blue");
	Car car1 = new Car(2016, "Toyota", "Corolla", "Green", 16, 28);
	Bus bus1 = new Bus(2015 , "New Flyer", "D60LF", "Blue", 60, "Articulated");
	Car car2 = new Car(2017,"Lamborghini", "Aventador", "Yellow", 20,35);
	Bus bus2 = new Bus(2017,"Gillig", "Advantage", "White", 30, "Non-Articulated");
	Bus bus3 = new Bus(2017,"VanHool", "ExquiCity", "Green", 85, "Bi-Articulated");
	
	/*
	 * Confirm the functioning of the classes
	 */
	veh1.getVehicleInfo();
	System.out.println();
	veh2.getVehicleInfo();
	System.out.println();
	car1.getVehicleInfo();
	System.out.println("Car Height: " + car1.getCarHeight());
	System.out.println("Car Length: " + car1.getCarLength());
	System.out.println();
	car2.getVehicleInfo();
	System.out.println("Car Height: " + car2.getCarHeight());
	System.out.println("Car Length: " + car2.getCarLength());
	System.out.println();
	bus1.getVehicleInfo();
	System.out.println("Passenger Limit: " + bus1.getPassengerLimit());
	System.out.println("Bus Type: " + bus1.getBusType());
	System.out.println();
	bus2.getVehicleInfo();
	System.out.println("Passenger Limit: " + bus2.getPassengerLimit());
	System.out.println("Bus Type: " + bus2.getBusType());
	System.out.println();
	bus3.getVehicleInfo();
	System.out.println("Passenger Limit: " + bus3.getPassengerLimit());
	System.out.println("Bus Type: " + bus3.getBusType());
	System.out.println();
	
	/*
	 * Modify information to verify functioning of program
	 */
	bus1.setPassengerLimit(25);
	bus1.setBusType("Single");
	System.out.println("The " + bus1.getYear() + " " +  bus1.getMake() + " " + bus1.getModel() +  " in " + bus1.getColor() + " can now accomodate " + 
	bus1.getPassengerLimit() + " passengers and is a " + bus1.getBusType() + " bus type.");
	System.out.println();
	car2.setCarHeight(27);
	System.out.println("The " + car2.getYear() + " " + car2.getMake() + " " + car2.getModel() + " in " + car2.getColor() +
			" is now " + car2.getCarHeight() + " feet high.");
	System.out.println();
	

	}
}
