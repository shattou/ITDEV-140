import java.util.Scanner;

public class AreaCalculatorApp {

	public static void main(String args[]) // main method
	{
		Scanner input = new Scanner(System.in); // creates Scanner object

		System.out.println("Welcome To The Area Calculator.\nThis app is designed to calculate the area of a circle, rectangle, and a cylinder.\n"); // displays the title

		System.out.print("Please enter the radius of the circle: "); // prompts for the circle radius
		double rad = input.nextDouble(); // reads into rad (for circle)

		System.out.print("Please enter the width of the rectangle: "); // prompts for the rectangle width
		float width = input.nextFloat(); // reads into width

		System.out.print("Please enter the length of the rectangle: "); // prompts for the rectangle length
		float length = input.nextFloat(); // reads into length

		System.out.print("Please enter the base radius of the cylinder: "); // prompts for the cylinder radius
		double radi = input.nextDouble(); // reads into radi (for cylinder)

		System.out.print("Please enter the height of the cylinder: "); // prompts for the cylinder height
		double height = input.nextDouble(); // reads into height

		System.out.println("\n******************************\n\tResults\n******************************");

		System.out.printf("\nThe area of the circle is: %.2f\n", AreaClass.Area(rad));
		System.out.printf("The area of the rectangle is: %.2f\n", AreaClass.Area(length, width));
		System.out.printf("The area of the cylinder is: %.2f\n\n", AreaClass.Area(radi, height));
		// calls the Area function 3 times for 3 shapes and formats the area to 2
		// decimal places and prints it to screen

		System.out.println("Thank you for using this application. See you next time!");
	}
}
