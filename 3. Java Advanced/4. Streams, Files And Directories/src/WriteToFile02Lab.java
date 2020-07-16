import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class WriteToFile02Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/input.txt";
        String output = "output.txt";
        FileInputStream fis = new FileInputStream(input);
        FileOutputStream fos = new FileOutputStream(output);
        Set<Character> characters = Set.of(',', '.', '!', '?');
        int oneByte = fis.read();
        while (oneByte != -1){
            if (!characters.contains((char) oneByte)) {
                fos.write(oneByte);
                System.out.print((char) oneByte);
            }
            oneByte = fis.read();
        }
    }
}
