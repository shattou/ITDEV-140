import java.util.*;

public class GrapevineSpacing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double number, length, amount, space;

		System.out.println("Please enter the length of the rown in feet: ");
		length = input.nextDouble();

		System.out.println("Please enter the amount of space used by an end-post assembly: ");
		amount = input.nextDouble();

		System.out.println("Please enter the space between vines in feet: ");
		space = input.nextDouble();

		number = ((length) - (2 * amount)) / (space);

		System.out.println("The number of grapevines that would fit in the row is: " + number);

		input.close();
	}

}
