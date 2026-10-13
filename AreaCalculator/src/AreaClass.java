public class AreaClass {

	public static double Area(double rad) { // function to find the area of a circle

		return Math.PI * rad * rad;
	}

	public static double Area(float length, float width) { // function to find the area of a rectangle

		return length * width;

	}

	public static double Area(double radi, double height) { // function to find the area of a cylinder

		return Math.PI * radi * radi * height;

	}
}
