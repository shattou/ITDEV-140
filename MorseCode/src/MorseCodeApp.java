import java.util.Scanner;

public class MorseCodeApp {

	public static void main(String[] args) {


		System.out.print("Please enter a string. Maximum of 40 characters: ");
		Scanner input = new Scanner(System.in);
		String original = input.nextLine();


		Morse app = new Morse(original);
		System.out.println ("The morse code equivalent of: "+app.getOriginal()+" is: "+app.getMorseCode());



	}

}
