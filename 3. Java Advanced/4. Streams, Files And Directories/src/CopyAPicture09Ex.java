import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.Scanner;

public class CopyAPicture09Ex {
    public static void main(String[] args) throws IOException {
        String path = "img.jpg";
        byte[] bytes = Files.readAllBytes(Path.of(path));
        String encoded = Base64.getEncoder().encodeToString(bytes);
        new FileOutputStream("copy-img.jpg").write(bytes);
    }
}
