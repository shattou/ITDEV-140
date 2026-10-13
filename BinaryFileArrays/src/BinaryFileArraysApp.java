import java.util.Scanner;

public class BinaryFileArraysApp extends FileArray {

	public static void main(String[] args) {

		// creating a scanner object to read user input

		Scanner input = new Scanner(System.in);

		// the binary array hold the numbers to be written to a file

		int[] binary = { 1, 2, 3, 4, 5, 6, 7, 8};

		String filename;

		int[] num = new int[binary.length];

		// Takes in file name from user

		System.out.print("Enter the file name to write and read operations: ");

		// assigns file name from user input into the variable 'filename'

		filename = input.nextLine();

		// calling write and read methods

		try

		{

			writeArray(filename, binary);

			readArray(filename, num);

		}

		catch(Exception e)

		{

		}

		System.out.print("Here are the numbers stored in '" + filename + "': ");

		// Displaying numbers from the file

		for (int i = 0; i < num.length; i++) {

			System.out.print(num[i] + ", ");

		}

	}

}
