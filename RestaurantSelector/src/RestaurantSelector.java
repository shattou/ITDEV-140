import java.util.Scanner;

public class RestaurantSelector {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Is anyone in your party a vegetarian? ");
		String vegetarian = input.nextLine();

		String message = "";

		if (vegetarian.equals("yes") || vegetarian.equals("no")) {
			System.out.print("Is anyone in your party a vegan? ");
			String vegan = input.next();

			if (vegan.equals("yes") || vegan.equals("no")) {
				System.out.print("Is anyone in your party gluten-free? ");
				String gluten_free = input.next();

				if (gluten_free.equals("yes") || gluten_free.equals("no")) {
					message = "\nHere are your restaurant choices:\n";

					if (vegetarian.equals("yes")) {
						if (vegan.equals("yes")) {
							if (gluten_free.equals("yes") || gluten_free.equals("no")) {
								message += "Corner Cafe\n" + "The Chef's Kitchen\n";
							}
						} else {
							if (gluten_free.equals("yes")) {
								message += "Main Street Pizza Company\n" + "Corner Cafe\n" + "The Chef's Kitchen\n";
							} else {
								message += "Main Street Pizza Company\n" + "Corner Cafe\n" + "Mama's Fine Italian\n"
										+ "The Chef's Kitchen\n";
							}
						}
					} else // vegetarian == "no"
					{
						if (vegan.equals("yes")) {
							if (gluten_free == "yes" || gluten_free.equals("no")) {
								message += "Corner Cafe\nThe Chef's Kitchen\n";
							}
						} else // vegan == "no"
						{
							if (gluten_free.equals("yes")) {
								message += "Main Street Pizza Company\n" + "Corner Cafe\n" + "The Chef's Kitchen\n";
							} else // gluten free == "no"
							{
								message += "Joe's Gourmet Burgers\n" + "Main Street Pizza Company\n" + "Corner Cafe\n"
										+ "Mama's Fine Italian\n" + "The Chef's Kitchen\n";
							}
						}
					}
				} else {
					System.out.println("Enter either 'yes' or 'no'.\\nRerun the program and try again.");
				}
			} else {
				System.out.println("Enter either 'yes' or 'no'.\\nRerun the program and try again.");
			}
		} else {
			System.out.println("Enter either 'yes' or 'no'.\\nRerun the program and try again.");
		}

		System.out.println(message);


	}

}
