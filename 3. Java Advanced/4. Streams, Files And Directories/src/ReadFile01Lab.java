import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile01Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/input.txt";
        FileInputStream fis = new FileInputStream(input);
        int oneByte = fis.read();
        while (oneByte != -1) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fis.read();
        }
    }
}
