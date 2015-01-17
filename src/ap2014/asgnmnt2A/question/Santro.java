package ap2014.asgnmnt2A.question;

public class Santro extends EnginePoweredFourWheeler {

	public Santro(int numOfWheel, String Owner, boolean HasPolicy,
			String DateofExpiry) {
		super(numOfWheel, HasPolicy, DateofExpiry);
		this.numOfWheel = numOfWheel;
		// TODO Auto-generated constructor stub
		this.Owner = Owner;
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return "HYUN1234";
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
