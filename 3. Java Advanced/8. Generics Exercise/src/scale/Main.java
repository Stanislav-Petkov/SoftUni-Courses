package scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("A","B");
        System.out.println(scale.getHeavier());
    }
}
