import java.util.*;

public class CompoundInterest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double amountMoney, principalAmount, interestRate, numberCompound, years, iRate;

		System.out.println("Please enter the principal amount originally deposited into the account: ");
		principalAmount = input.nextDouble();
		System.out.println();

		System.out.println("Please enter the annual interest rate in whole numbers: ");
		interestRate = input.nextDouble();
		System.out.println();

		System.out.println("Please enter the number of times per year the interest is compounded"
				+ "\n Monthly (12)"
				+ "\n Quarterly (4)"
				+ "\n Bi-Annually (2)"
				+ "\n Annually (1)"
				+ "\n: ");
		numberCompound = input.nextDouble();
		System.out.println();

		System.out.println("Please enter the specified number of years left to earn interest: ");
		years = input.nextDouble();
		System.out.println();

		iRate = interestRate / 100;

		amountMoney = principalAmount * Math.pow ((1 + (iRate/numberCompound)), numberCompound * years);

		System.out.println("The amount of money that will be in the account after " + years + "year(s) is: $" + amountMoney);

		input.close();
	}

}
