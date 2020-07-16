import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class SumBytes02Ex {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        BufferedReader br = new BufferedReader(new FileReader(input));
        long sum = 0;
        for (byte value : Files.readAllBytes(Path.of(input))) {
            if (value != 10 && value != 13) {
                sum += value;
            }
        }
        System.out.println(sum);
    }
}