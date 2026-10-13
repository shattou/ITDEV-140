import java.util.Scanner;

public class AverageRainfall {

	public static void main(String[] args) {

		int rainfall, yearInput;

		Scanner input = new Scanner(System.in);

		int totalRainFall = 0, count = 0;

		System.out.print("Enter the number of years : ");

		while (true) {

			yearInput = input.nextInt();

			if (yearInput < 1) {

				System.out.print("Invalid input, please enter a number greater than zero : ");

			} else {

				break;

			}

		}

		// loop the year

		for (int year = 1; year <= yearInput; year++) {

			// loop the months

			for (int month = 1; month <= 12; month++) {

				System.out.print("Enter the inches of rainfall for month " + month + " : ");

				rainfall = input.nextInt();

				while (rainfall < 0) {

					System.out.print("Invalid input, Enter the inches of rainfall for month " + month + " : ");

					rainfall = input.nextInt();

				}

				count++;

				totalRainFall += rainfall;

			} // end of inner for

		}

		double avg = (double) totalRainFall / count;

		System.out.println("Total number of months : " + count);

		System.out.println("Total rainfall : " + totalRainFall);

		System.out.println("Average rainfall : " + avg);

	}
}
