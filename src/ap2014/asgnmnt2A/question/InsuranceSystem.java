package ap2014.asgnmnt2A.question;

public class InsuranceSystem {

	public Vehicle[] getFewVehicles() {
		Santro santro = new Santro(4, "ram", true, "16.3.2015");
		SX4 sx4 = new SX4(4, "tushar", true, "29.3.2014");
		SuzukiHayabusa hayabusa = new SuzukiHayabusa(2, "abhishek", true,
				"10.4.2016", false);

		YamahaFZS fzs = new YamahaFZS(2, "sid", true, "16.8.2013", true);
		HeroHercules hercules = new HeroHercules(2, "ravi", true);
		Firefox ff = new Firefox(2, "ramesh", true);

		Vehicle[] vehicles = new Vehicle[6];
		vehicles[0] = santro;
		vehicles[1] = sx4;
		vehicles[2] = fzs;
		vehicles[3] = hayabusa;
		vehicles[4] = ff;
		vehicles[5] = hercules;

		return vehicles;
	}
}
