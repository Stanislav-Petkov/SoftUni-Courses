import java.util.Scanner;

public class WriteEveryThirdline05 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "files-resources/input.txt";
        String output = "output.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(input));
             PrintWriter pr = new PrintWriter(new FileWriter(output))) {
            String line = br.readLine();
            int counter = 1;
            while (line != null) {
                if (counter % 3 == 0) {
                    pr.println(line);
                }
                counter++;
                line = br.readLine();
            }
        }
    }
}
