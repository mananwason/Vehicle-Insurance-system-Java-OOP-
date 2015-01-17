package ap2014.asgnmnt2A.question;

public abstract class EnginePoweredVehicle extends Vehicle {

	public boolean HasPolicy;
	protected String DateofExpiry;
	protected String PolicyNumber;

	public EnginePoweredVehicle(int numOfWheel, boolean HasPolicy,
			String DateofExpiry) {
		super(numOfWheel);
		this.HasPolicy = HasPolicy;
		this.DateofExpiry = DateofExpiry;
	}

}