import java.util.Scanner;

public class PasswordVerifierApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter password: ");
		String pass = input.next();

		PasswordVerifier pv = new PasswordVerifier(pass);
		if (pv.isValid())

			System.out.println("The password is Valid");
		else
			System.out.println("Invalid password. Try again later.");
	}

}
