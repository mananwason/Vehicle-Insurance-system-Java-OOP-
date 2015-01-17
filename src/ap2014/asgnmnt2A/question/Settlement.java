package ap2014.asgnmnt2A.question;

public class Settlement {
	public static void settle(Vehicle a, Vehicle b) {
		try {
			if (a.policy.equals("package")) {

				a.damage = a.damage - 0.5 * (a.damage);
				b.damage = b.damage - 0.8 * (b.damage);

			} else if (a.policy.equals("Third party")) {

				b.damage = b.damage - 0.8 * (b.damage);

			} else if (a.policy.equals("No Policy")) {

				System.out
						.println("\n VEHICLE HAS NO INSURANCE, IT IS NOT ENGINE POWERED\n");

			} else if (a.policy.equals("Expired")) {
				throw new PolicyExpiredException("\nSELF POLICY IS EXPIRED "
						+ "GET READY FOR A FIGHT !!! \n");

			}
		} catch (PolicyExpiredException p) {
			System.out.println("Exception: " + p.getMessage());
			p.printStackTrace();
		}

	}
}