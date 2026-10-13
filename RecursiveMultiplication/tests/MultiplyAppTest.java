package recursivemultiplication;

public class MultiplyAppTest {
    public static void main(String[] args) {
        MultiplyApp app = new MultiplyApp();
        int[][] cases = {{3, -4, -12}, {-3, 4, -12}, {-3, -4, 12},
            {3, 4, 12}, {0, -8, 0}, {-8, 0, 0}, {1, Integer.MIN_VALUE, Integer.MIN_VALUE},
            {1, Integer.MAX_VALUE, Integer.MAX_VALUE}, {1000, -1000, -1000000}};
        for (int[] example : cases) {
            int actual = app.multiply(example[0], example[1]);
            if (actual != example[2]) throw new AssertionError("Incorrect result for " + example[0] + " and " + example[1]);
        }
        System.out.println("MultiplyApp tests passed.");
    }
}
