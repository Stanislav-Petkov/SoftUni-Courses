package randomArrayList4;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RandomArrayListComposition ralc = new RandomArrayListComposition();
        ralc.add("Alice");
        ralc.add("Bob");
        System.out.println(ralc.getRandomElement());

        RandomArrayList randomArrayList = new RandomArrayList(new Random());
        randomArrayList.add("Alice1");
        randomArrayList.add("Bob1");
        System.out.println(randomArrayList.getRandomElement());
        ralc.
    }
}
