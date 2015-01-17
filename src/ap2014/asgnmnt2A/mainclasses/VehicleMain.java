package ap2014.asgnmnt2A.mainclasses;

import ap2014.asgnmnt2A.question.*;

public class VehicleMain {

	public static void main(String[] args) {
		InsuranceSystem system = new InsuranceSystem();
		Vehicle[] vehicles = system.getFewVehicles();
		// INITIALIZE VEHICLES
		for (int i = 0; i < vehicles.length; i++) {
			Vehicle vehicle = vehicles[i];
			Display.print(vehicle);
		}
		System.out
				.println("====================COLLISION  BEGINS===============================");
		// COLLISION PROCESS IN NESTED FOR LOOP

		for (int i = 0; i < vehicles.length; i++) {
			Vehicle vehicle1 = vehicles[i];
			int j = 0;
			for (j = 0; j < vehicles.length; j++) {
				if (i != j) {
					System.out
							.println("\n\n################################   COLLISION  VEHICLE "
									+ (i + 1)
									+ "  WITH VEHICLE "
									+ (j + 1)
									+ "  STARTS  ##################################################\n");
					Vehicle vehicle2 = vehicles[j];
					// Collision method
					collision.collide(vehicles[i], vehicles[j]);
					System.out
							.println("Damage self : "
									+ vehicle1.damage
									+ "                                Damages Oncoming Vehicle:"
									+ vehicle2.damage);
					System.out
							.println("\n------------------------DAMAGES AFTER SETTLEMENT-----------------------------------\n");
					System.out.println("SETTLEMENT DETAILS : ");

					// VEHICLE SETTLEMENT PROCESS BASED ON POLICY CHECK
					Settlement.settle(vehicle1, vehicle2);

					// DAMAGE AFTER SETTLEMENT
					System.out
							.println("Damage self : "
									+ vehicle1.damage
									+ "                                Damages Oncoming Vehicle: "
									+ vehicle2.damage + "\n");

					System.out
							.println("\n################################   COLLISION  VEHICLE "
									+ (i + 1)
									+ "  WITH VEHICLE "
									+ (j + 1)
									+ "  ENDS  ##################################################\n");

				}

				else {
					System.out.println("");
				}
			}
		}

	}
}
