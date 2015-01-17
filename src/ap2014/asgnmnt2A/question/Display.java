package ap2014.asgnmnt2A.question;

public class Display {

	public static void print(Vehicle vehicle) {
		if (vehicle instanceof EnginePoweredVehicle) {
			if (vehicle instanceof RegisteredVehicle) {
				RegisteredVehicle rv = (RegisteredVehicle) vehicle;
				String regNo = rv.getRegistration();
				if (regNo == "expired" || regNo.trim().length() == 0) {
					System.out
							.print(" \nVehicle is engine powered, registered but Registration is Expired : \n\n VEHICLE DESCRIPTION : \n  ");
					System.out.print(vehicle);
				} else {
					System.out
							.print(" \nVehicle is engine powered, registered and has valid reg no : \n\nVEHICLE DESCRIPTION : \n");
					System.out.print(vehicle);

				}
			} else {
				System.out
						.print(" \nVehicle is engine powered but not registered  :\n\n VEHICLE DESCRIPTION : \n");
				System.out.print(vehicle);
			}

		} else {
			System.out
					.print("\nVehicle is not engine powered, Registration is not required :\n\n VEHICLE DESCRIPTION : \n");
			System.out.print(vehicle);
		}
	}
}
