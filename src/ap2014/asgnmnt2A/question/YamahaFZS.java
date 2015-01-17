package ap2014.asgnmnt2A.question;

public class YamahaFZS extends EnginePoweredTwoWheeler {

	public YamahaFZS(int numOfWheel, String Owner, boolean HasPolicy,
			String DateofExpiry, boolean isKickStart) {
		super(numOfWheel, HasPolicy, DateofExpiry, isKickStart);
		// TODO Auto-generated constructor stub
		this.Owner = Owner;
		this.policy = "Expired";

	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return "expired";
	}

	public String toString() {
		String classname = getClass().getName();
		return "I am " + classname.substring(classname.lastIndexOf('.') + 1)
				+ ", " + Owner + "  \nHave Policy : " + HasPolicy
				+ "\n Number of wheels : " + numOfWheel + "\nPolicy number : "
				+ getRegistration() + "\n" + "policy type : " + policy
				+ "\ndate of expiry : " + DateofExpiry + "\n"
				+ "Self Damage : " + damage + "\n";

	}
}
