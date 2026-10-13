import java.util.Arrays;
import java.util.Scanner;

public class MagicSquare {

	public static void main(String[] args) {

//Get the inputs from the user.
		Scanner input = new Scanner(System.in);
		while (true) {
			int[][] square = new int[3][3];

//Nested loop will take the user input and fill the two-dimensional array
			for (int row = 0; row < 3; row++) {
				for (int col = 0; col < 3; col++) {
					System.out.print("Input value for row " + (row + 1) + " column " + (col + 1) + ": ");
					square[row][col] = input.nextInt();
				}
			}
//Calling the method to check the matrix is a magic square or not.
			String str = magicSum(square);
			System.out.println(str);

			System.out.println("Continue (Y/N): ");
			char ch = input.next(".").charAt(0);
			if (ch == 'Y' || ch == 'y')
				continue;
			else {
				System.out.println("Thank you for playing. See you next time!!");
			}
			break;
		}
	}

// Method code which contains logic which checks whether the matrix is a magic square or not.
	private static String magicSum(int[][] square) {
		int order = square.length;

		int[] sumRow = new int[order];
		int[] sumCol = new int[order];
		int[] sumDiag = new int[2];

		Arrays.fill(sumRow, 0);
		Arrays.fill(sumCol, 0);
		Arrays.fill(sumDiag, 0);

//calculating the Sum of Each row
		for (int row = 0; row < order; row++) {
			for (int col = 0; col < order; col++) {
				sumRow[row] += square[row][col];
			}
			System.out.println("sum row " + row + ": " + sumRow[row]);
		}

//calculating the Sum of Each column
		for (int col = 0; col < order; col++) {
			for (int row = 0; row < order; row++) {
				sumCol[col] += square[row][col];
			}
			System.out.println("sum columns " + col + ": " + sumCol[col]);
		}

//calculating the Sum of Diagonal 1
		for (int row = 0; row < order; row++) {
			sumDiag[0] += square[row][row];
		}
		System.out.println("sum diagonal 0 " + ": " + sumDiag[0]);

//calculating the Sum of Diagonal 2
		for (int row = 0; row < order; row++) {
			sumDiag[1] += square[row][order - 1 - row];
		}
		System.out.println("sum diagonal 1 " + ": " + sumDiag[1]);

		boolean bool = true;

		int sum = sumRow[0];
		for (int i = 1; i < order; i++) {
			bool = bool && (sum == sumRow[i]);
		}
		for (int i = 0; i < order; i++) {
			bool = bool && (sum == sumCol[i]);
		}
		for (int i = 0; i < 2; i++) {
			bool = bool && (sum == sumDiag[i]);
		}

		if (bool) {
			return "This is a Lo Shu Magic Square whose sum is: " + sum;
		} else {
			return " **This is not a Lo Shu Magic Square** ";
		}
	}
}
