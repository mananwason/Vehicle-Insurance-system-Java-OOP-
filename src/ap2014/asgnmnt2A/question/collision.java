package ap2014.asgnmnt2A.question;

import java.util.Random;

public class collision {

	public static void collide(Vehicle a, Vehicle b) {
		Random rand = new Random();
		int v1 = rand.nextInt(9000) + 1;
		int v2 = rand.nextInt(9000) + 1;
		a.damage = v1;
		b.damage = v2;
		Display.print(a);
		System.out.print("\n\n");

		System.out
				.print("//////////////////////////////      VS      /////////////////////////////////////////");
		System.out.print("\n\n");
		Display.print(b);
		System.out
				.print("\n============= FINAL DAMAGES OF SELF AND ONCOMING ===============\n\n");

	}

}
