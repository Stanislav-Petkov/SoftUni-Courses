import java.util.Scanner;

public class LineNumbers05Ex {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:\\Users\\admin-pc\\Desktop\\advResources\\inputLineNumbers.txt";
        String output = "output.txt";
        BufferedReader br = new BufferedReader(new FileReader(input));
        BufferedWriter bw = new BufferedWriter(new FileWriter(output));
        String line = br.readLine();
        int lineNumber = 1;
        while (line != null) {
            String outputString = lineNumber + ". " + line;
            bw.write(outputString);
            bw.newLine();
            line = br.readLine();
            lineNumber++;
        }
        bw.close();
    }
}
