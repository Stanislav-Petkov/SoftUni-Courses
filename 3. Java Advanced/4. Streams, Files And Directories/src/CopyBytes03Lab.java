import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyBytes03Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = "files-resources/input.txt";
        String output = "output.txt";

        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);

        int space = ' ';
        int newLine = '\n';
        int oneByte = fis.read();
        while (oneByte != -1) {
            String digits = String.valueOf(oneByte);
            if (oneByte == space || newLine == oneByte) {
                fos.write(oneByte);
            } else {
                for (int i = 0; i < digits.length(); i++) {
                    fos.write(digits.charAt(i));
                }
            }

            oneByte = fis.read();
        }

    }
}
