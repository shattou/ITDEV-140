import java.io.*;

public class FileArray {

	public static void writeArray(String filename, int[] binary) throws IOException {

		FileOutputStream fstream = new FileOutputStream(filename);

		DataOutputStream outputFile = new DataOutputStream(fstream);

		// Printing out array numbers

		System.out.println("\n\nThe numbers in the array 'binary' are: ");

		for (int i = 0; i < binary.length; i++)

		System.out.print(binary[i] + ",");

		System.out.println("\n\nWriting the numbers in the array to the binary-file - " + filename + "...");

		// calling writeInt method on outputFile object

		// Writing the array elements to the file

		for (int i = 0; i < binary.length; i++)

		outputFile.writeInt(binary[i]);

		System.out.print("Done.\n");

		// closing stream object

		outputFile.close();
	}


	public static void readArray(String filename, int[] num) throws IOException {

		boolean endOfFile = false;

		// creating the file stream

		FileInputStream fstream = new FileInputStream(filename);

		DataInputStream inputFile = new DataInputStream(fstream);

		// displaying the numbers in the text file

		System.out.println("\nReading numbers from '" + filename + "'.");

		int i = 0;

		while (!endOfFile && i < num.length) {

			try {

				num[i] = inputFile.readInt();

				i++;

			} catch (FileNotFoundException e) {

				System.out.print("File not found");

			} catch (EOFException e) {

				endOfFile = true;

			}

		}

		System.out.println("Done.\n");

		// closing the file

		inputFile.close();

	}

}
