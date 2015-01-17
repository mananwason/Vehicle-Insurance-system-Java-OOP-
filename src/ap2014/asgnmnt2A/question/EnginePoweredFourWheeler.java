package ap2014.asgnmnt2A.question;

public abstract class EnginePoweredFourWheeler extends EnginePoweredVehicle {
	 int numOfDoors;

	public EnginePoweredFourWheeler(int numOfWheel,
			boolean HasPolicy, String DateofExpiry) {
		super(numOfWheel, HasPolicy, DateofExpiry);
		// TODO Auto-generated constructor stub;
		this.policy = "package";

	}

}