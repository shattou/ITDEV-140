import java.io.DataOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileArrayTest {
    public static void main(String[] args) throws Exception {
        Path folder = Files.createTempDirectory("file-array-test");
        Path custom = folder.resolve("my numbers.bin");
        Path other = folder.resolve("other.bin");
        try {
            int[] expected = {7, -3, 0, Integer.MAX_VALUE};
            FileArray.writeArray(custom.toString(), expected);
            if (!Files.exists(custom)) throw new AssertionError("Must write to the requested filename");
            int[] actual = new int[4];
            FileArray.readArray(custom.toString(), actual);
            if (!Arrays.equals(expected, actual)) throw new AssertionError("Round trip changed the numbers");
            try (DataOutputStream output = new DataOutputStream(Files.newOutputStream(other))) {
                output.writeInt(42);
                output.writeInt(99);
            }
            int[] single = new int[1];
            FileArray.readArray(other.toString(), single);
            if (single[0] != 42) throw new AssertionError("Must read the requested file");
            System.out.println("FileArray tests passed.");
        } finally {
            Files.deleteIfExists(custom);
            Files.deleteIfExists(other);
            Files.deleteIfExists(folder);
        }
    }
}
