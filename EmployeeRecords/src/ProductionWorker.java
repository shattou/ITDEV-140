public class ProductionWorker extends Employee {
	private int shift;
	private double payRate;
	public final int DAY_SHIFT = 1;
	public final int NIGHT_SHIFT = 2;

	public ProductionWorker(String n, String num, String date, int sh, double rate) {
		super (n, num, date);
		setShift(sh);
		setPayRate(rate);
	}

	public ProductionWorker() {
		super();
		shift = DAY_SHIFT;
		payRate = 0.0;
	}

	public void setShift(int s) {
		shift = s;
	}

	public void setPayRate(double p) {
		payRate = p;
	}

	public int getShift() {
		return shift;
	}

	public double getPayRate() {
		return payRate;
	}
	 public String toString() {
		 String results = super.toString();
		 results+= "\nShift: ";
		 if(shift == DAY_SHIFT)
			 results+= "Day";
		 else if (shift == NIGHT_SHIFT)
			 results= "Night";
		 else results+= "INVALID SHIFT NUMBER";
		 results+= String.format("\nHourly Pay Rate: $%,.2f", payRate);

		 return results;
	 }

}
