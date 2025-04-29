package BirdsOOPS;

public class Dove extends Creature implements CanFly {
	private FlightMode flightMode;

	public void setFlightMode(FlightMode flightMode) {
		this.flightMode =flightMode;
	}

	public FlightMode getFlightMode() {
		return flightMode;
	}

	@Override
	public void fly() {
		if (flightMode !=null) {
			flightMode.performFlight();
		}
	}
}