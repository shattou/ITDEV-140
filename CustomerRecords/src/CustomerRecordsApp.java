import java.util.Scanner;

public class CustomerRecordsApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the customer's name: ");
		String n = input.nextLine();

		System.out.println("Please enter the customer's address: ");
		String a = input.nextLine();

		System.out.println("Please enter the customer's phone number: ");
		String p = input.nextLine();

		System.out.println("Please enter the customer number: ");
		String c = input.nextLine();

		System.out.println("Is the customer on the mailing list? (Y/N): ");

		String s = input.nextLine();
		boolean m  = (s.equalsIgnoreCase("y") ? true : false);



		Customer customer = new Customer(n, a, p, c, m);

		System.out.println("Customer Detail: \n");
		System.out.println("Name: " + customer.getName());
		System.out.println("Address: " + customer.getAddress());
		System.out.println("Phone number: " + customer.getPhone());
		System.out.println("Customer ID: " + customer.getCustomerNumber());

		System.out.println("Is customer on mailing list?: " + (customer.getMailingList() == true ? "Yes" : "No"));



	}

}
