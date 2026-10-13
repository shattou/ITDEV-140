public class CellPhone {

	private String manufact; // manufacturer
	private String model; // model
	private double retailPrice; // Retail Price

	public CellPhone(String man, String mod, double price) { //constructor method
		manufact = man;
		model = mod;
		retailPrice = price;
	}

	//accepts an argument for manufacture. Change the value of manufact field after the object has been created if necessary.
	public void setManufact(String man) {
		manufact = man;
	}

}
