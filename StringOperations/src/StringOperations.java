import java.util.*;

public class StringOperations {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String city;

		System.out.println("Please enter your favourite city: ");
		System.out.println();
		city = input.nextLine();

		System.out.println();
		System.out.println("The number of characters in the city name are: " + city.length() +
				"\nThe name of the city in all uppercase letters is: " + city.toUpperCase() +
				"\nThe name of the city in all lowercase letters is: " + city.toLowerCase() +
				"\nThe first character in the name of the city is: " + city.charAt(0));

		input.close();
	}

}
