import java.util.Scanner;

public class EmployeeRecordsApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char choice;

		do {
			System.out.println("Please enter your name: ");
			String n = input.nextLine();

			System.out.println("Please enter your employee number. Ensure that the format is XXX-L"
					+ " (where each X is a digit within the range of 0-9 and L is a letter within the range of A-M): ");
			String num = input.nextLine();

			System.out.println("Please enter your hire date: ");
			String date = input.nextLine();

			System.out.println("Please enter your shift. Enter (1) for day shift and (2) for night shift: ");
			int sh = Integer.parseInt(input.nextLine());

			System.out.println("Please enter your pay rate: $");
			double rate = Double.parseDouble(input.nextLine());

			ProductionWorker worker = new ProductionWorker(n, num, date, sh, rate);

			System.out.println("Details of the employee: ");
			System.out.println(worker);

			System.out.println("\nWould you like to enter another employee? (Y/N): ");
			choice = input.nextLine().charAt(0);
			System.out.println();

		}
		while(choice == 'Y' || choice == 'y');
		}
}
