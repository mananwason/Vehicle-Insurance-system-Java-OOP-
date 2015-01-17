package ap2014.asgnmnt2A.question;

public class HeroHercules extends HumanPoweredVehicle {

	private boolean isSideStand;

	public HeroHercules(int numOfWheel, String Owner, boolean isSideStand) {
		super(numOfWheel);
		this.isSideStand = isSideStand;
		// TODO Auto-generated constructor stub
		this.Owner = Owner;
		this.policy = "No Policy";
	}

	public String toString() {
		String classname = getClass().getName();
		return "I am " + classname.substring(classname.lastIndexOf('.') + 1)
				+ ", " + Owner

				+ "\n Number of wheels : " + numOfWheel + "\nPolicy number : "
				+ "\n" + "Self Damage : " + damage + "\n";
	}

	@Override
	public String getRegistration() {
		// TODO Auto-generated method stub
		return "NON ENGINE VEHICLE";
	}

}
