package ap2014.asgnmnt2A.question;

public class Firefox extends HumanPoweredVehicle {

	private boolean isSideStand;

	public Firefox(int numOfWheel, String _Owner, boolean isSideStand) {
		super(numOfWheel);
		// TODO Auto-generated constructor stub
		this.isSideStand = isSideStand;
		this.Owner = _Owner;
		this.policy = "No Policy";
	}

	public String toString() {
		String classname = getClass().getName();
		return "I am " + classname.substring(classname.lastIndexOf('.') + 1)
				+ ", " + Owner + "\n Number of wheels : " + numOfWheel
				+ "\nPolicy number : " + "\n" + "Self Damage : " + damage
				+ "\n";

	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return "NON ENGINE VEHICLE";
	}
}
