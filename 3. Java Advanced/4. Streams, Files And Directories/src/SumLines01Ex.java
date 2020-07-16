import java.io.*;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SumLines01Ex {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String input = "C:/Users/admin-pc/Desktop/advResources/input.txt";
        BufferedReader reader = new BufferedReader(new FileReader(input));
        String line = reader.readLine();
        while (line != null){
            int sum = 0;
            for(char symbol : line.toCharArray()){
                sum += symbol;
            }
            System.out.println(sum);
            line = reader.readLine();
        }
        reader.close();
    }
}
