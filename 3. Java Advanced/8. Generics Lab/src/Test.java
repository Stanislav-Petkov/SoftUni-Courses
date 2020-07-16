import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List strings = new ArrayList();
        strings.add("1");
        strings.add("2");
        strings.add(3);
        String e1  = (String) strings.get(0);
        String e2  = (String) strings.get(1);
        String e3  = (String) strings.get(2); // runtime error
    }
}
