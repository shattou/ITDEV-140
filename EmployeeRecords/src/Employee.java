public class Employee {
	private String name;
	private String employeeNumber;
	private String hireDate;

	public Employee(String n, String num, String date) {
		setName(n);
		setEmployeeNumber(num);
		setHireDate(date);

	}

	public Employee() {
		name = "";
		employeeNumber = "";
		hireDate = "";
	}

	public void setName(String n) {
		name = n;
	}

	public void setEmployeeNumber(String e) {
		if (isValidEmpNum(e)) {

			employeeNumber = e;
		}
		else {
			employeeNumber = "INAVLID NUMBER";
		}

	}

	public void setHireDate(String h) {
		hireDate = h;
	}

	public String getName() {
		return name;
	}

	public String getEmployeeNumber() {
		return employeeNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	private boolean isValidEmpNum(String e) {
		boolean status = false;

		if (e.length() == 5)
			status = true;
		else {
			if ((Character.isDigit(e.charAt(0))) || (Character.isDigit(e.charAt(1))) || (Character.isDigit(e.charAt(2)))
					|| (e.charAt(3) == '-') || (e.charAt(4) <= 'A') || (e.charAt(4) >= 'M'))
				status = true;
		}
		return status;

	}

	public String toString() {
		String result = "";

		result = "Employee name: " + name + "\n" + "Employee number: ";
		if (employeeNumber == "")
			result += "INVALID EMPLOYEE NUMBER";
		else
			result += employeeNumber;
		result += ("\n" + "Emplyee hire date: " + hireDate);

		return result;

	}
}
