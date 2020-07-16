import java.util.Scanner;

public class Merge2Files07Lab {
    public static void main(String[] args) throws IOException {
        String inputFile1 = "C:\\Users\\admin-pc\\Desktop\\advResources\\inputOne.txt";
        String inputFile2 = "C:\\Users\\admin-pc\\Desktop\\advResources\\inputTwo.txt";
        String outputFile = "output.txt";
        Scanner scanner = new Scanner(new File(inputFile1));
        PrintWriter writer = new PrintWriter(new File(outputFile));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        scanner = new Scanner(new FileInputStream(inputFile2));
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            writer.append(line).append(System.lineSeparator());
        }
        writer.close();
    }
}