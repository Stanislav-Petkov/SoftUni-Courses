import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class testEx {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:\\Users\\admin-pc\\Desktop\\advResources\\input.txt";
        FileInputStream inputStream = new FileInputStream(input);
        byte[] bytes = inputStream.readAllBytes();
        List<String> strings = Files.readAllLines(Path.of(input));
        System.out.println();
    }
}
