import java.util.Scanner;

public class AllCapitals03Lab {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = "C:/Users/admin-pc/Desktop/advResources";
        String output = "output.txt";

        File file = new File(input);
        if (file.exists()) {
            file.setWritable(true);
            file = new File(input + "\\NewDir");
            file.mkdir();
        }
    }
}
