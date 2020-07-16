import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        printStuff(e ->{
            try {
                PrintWriter writer = new PrintWriter("output.txt");
                writer.append(e);
                writer.flush();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        }, strings);
    }
    public static <T, C extends Collection<T>> void printStuff(Consumer<T> printer, C collection){
        collection.forEach(printer);
    }
}
