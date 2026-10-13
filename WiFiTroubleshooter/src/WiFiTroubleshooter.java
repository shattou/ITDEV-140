import java.util.Scanner;

public class WiFiTroubleshooter {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Reboot the computer and try to connect.");

		System.out.print("Did that fix the problem? ");
		String response = sc.nextLine();

		if (response.toLowerCase().equals("no")) {
			System.out.println("Reboot the router and try to connect.");

			System.out.print("Did that fix the problem? ");
			response = sc.nextLine();

			if (response.toLowerCase().equals("no")) {
				System.out.println("Make sure the cables between the router & modem are plugged in firmly.");

				System.out.print("Did that fix the problem? ");
				response = sc.nextLine();

				if (response.toLowerCase().equals("no")) {
					System.out.println("Move the router to a new location and try to connect.");

					System.out.print("Did that fix the problem? ");
					response = sc.nextLine();

					if (response.toLowerCase().equals("no")) {
						System.out.println("Get a new router.");
					}
				}
			}
		}
		sc.close();
	}
}
