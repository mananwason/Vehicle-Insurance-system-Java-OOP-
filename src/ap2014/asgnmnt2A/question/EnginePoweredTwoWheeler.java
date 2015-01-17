package ap2014.asgnmnt2A.question;

public abstract class EnginePoweredTwoWheeler extends EnginePoweredVehicle {
	protected boolean isKickStart;

	public EnginePoweredTwoWheeler(int numOfWheel, boolean HasPolicy,
			String DateofExpiry, boolean isKickStart) {
		super(numOfWheel, HasPolicy, DateofExpiry);
		// TODO Auto-generated constructor stub

		this.isKickStart = isKickStart;
		this.policy = "Third party";
	}
}
