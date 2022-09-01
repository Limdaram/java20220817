package ch08.book.s080506;

import ch08.book.s080505.Bus;
import ch08.book.s080505.Vehicle;

public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle = new Bus();
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}
