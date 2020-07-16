import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExtractIntegers04Lab {
    public static void main(String[] args) throws IOException {

        String input = "files-resources/input.txt";
        String output = "output.txt";

        try (FileInputStream fis = new FileInputStream(input);
             FileOutputStream fos = new FileOutputStream(output);
             Scanner scanner = new Scanner(System.in);
             PrintWriter printWriter = new PrintWriter(System.out)) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    int nextIng = scanner.nextInt();
                    printWriter.println(nextIng);
                    printWriter.flush();
                } else {
                    scanner.next();
                }
            }
        }

    }
}
