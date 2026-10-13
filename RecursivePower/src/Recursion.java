package recursivepower;

import java.util.Scanner;

public class Recursion {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    // Prompt the user for the base and exponent
	    System.out.print("Enter the base: ");
	    double base = scanner.nextDouble();
	    System.out.print("Enter the exponent: ");
	    int exponent = scanner.nextInt();

	    // Calculate the result by calling the raiseToPower method
	    double result = raiseToPower(base, exponent);

	    System.out.println(base + " raised to the power of " + exponent + " is " + result);
	  }

	  public static double raiseToPower(double base, int exponent) {
	    if (exponent == 0) {
	      // If the exponent is 0, the result is always 1
	      return 1;
	    } else {
	      // Recursively calculate the result by multiplying the base by the result of raising the base to the exponent minus 1
	      return base * raiseToPower(base, exponent - 1);
	    }
	  }

}
