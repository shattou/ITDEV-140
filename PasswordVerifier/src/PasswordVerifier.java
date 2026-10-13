public class PasswordVerifier {
	private String password;

	public PasswordVerifier(String a) {
		password = a;
	}

	public boolean isValid() {
		boolean hasUpperCase, hasLowerCase, hasDigit;
		hasUpperCase = false;
		hasLowerCase = false;
		hasDigit = false;
		if (password.length() < 6)
			return false;
		for (int i = 0; i < password.length(); i++) {
			if (password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
				hasLowerCase = true;
			if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z')
				hasUpperCase = true;
			if (password.charAt(i) >= '0' && password.charAt(i) <= '9')
				hasDigit = true;
		}

		if (hasUpperCase && hasLowerCase && hasDigit)
			return true;
		else
			return false;
	}
}
