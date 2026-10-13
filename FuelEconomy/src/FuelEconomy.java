import java.util.*;

public class FuelEconomy {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int milesDriven;
		int gallonsUsed;
		int milesPerGallon;

		System.out.println("Please enter the number of miles driven: ");
		milesDriven = input.nextInt();

		System.out.println("Please enter the Gallons of gas use: ");
		gallonsUsed = input.nextInt();

		milesPerGallon = milesDriven / gallonsUsed;

		System.out.println("The car's miles-per-gallon is: " + milesPerGallon + " MPG");
		input.close();
	}

}
