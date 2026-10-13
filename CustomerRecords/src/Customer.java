public class Customer extends Person {

	private String customerNumber;
	private boolean mailingList;

	public Customer() {
		super();
		mailingList = true;
	}

	public Customer(String n, String a, String p, String c, boolean m) {
		super(n, a, p);
		setCustomerNumber(c);
		setMailingList(m);
	}
	public void setCustomerNumber(String c) {
		customerNumber = c;
	}

	public void setMailingList(boolean m) {
		mailingList = m;
	}
	public String getCustomerNumber() {
		return customerNumber;
	}
	public boolean getMailingList() {
		return mailingList;
	}
}
