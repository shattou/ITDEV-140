package recursivemultiplication;

public class MultiplyApp {
	public int multiply(int x, int y) {
		if (y == 0) {
			return 0;
		}

		// Halving the multiplier keeps the recursion short.
		int half = multiply(x, y / 2);
		int result = half + half;
		if (y % 2 == 1) {
			return result + x;
		}
		if (y % 2 == -1) {
			return result - x;
		}
		return result;
	}
}
