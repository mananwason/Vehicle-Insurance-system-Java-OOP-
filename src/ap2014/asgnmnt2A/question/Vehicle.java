package ap2014.asgnmnt2A.question;

public abstract class Vehicle implements RegisteredVehicle {
	protected int numOfWheel;
	public double damage;
	public String Owner;
	public int ndamage;
	public String policy;

	public Vehicle(int numOfWheel) {
		this.numOfWheel = numOfWheel;
	}
}