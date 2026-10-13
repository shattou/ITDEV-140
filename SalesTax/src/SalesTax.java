import java.util.*;

public class SalesTax {

	public static void main(String[] args) {
		double Purchase;
		double stateTax;
		double countyTax;
		double totalTax;
		double totalSale;

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the amount of purchase: ");
		Purchase = input.nextDouble();

		stateTax = Purchase * 0.04;
		countyTax = Purchase * 0.02;
		totalTax = stateTax + countyTax;
		totalSale = Purchase + totalTax;

		System.out.println("The amount of the purchase is: $" + Purchase +
				"\nThe state sales tax is: $" + stateTax +
				"\nThe county sales tax is: $" + countyTax +
				"\nThe total sales tax is: $" + totalTax +
				"\nThe total of the sale is: $" + totalSale);

		input.close();
	}

}
