package demoStatic;

public class Counter {
    int count = 0;
    static int countStatic = 0;

    public Counter() {
        count++;
        countStatic++;
    }

    public void printCounters() {
        System.out.println("Count: " + count);
        System.out.println("Static count " + countStatic);
    }

    public static void main(String[] args) {

        Counter c1 = new Counter();
        c1.printCounters();

        Counter c2 = new Counter();
        c2.printCounters();

        Counter c3 = new Counter();
        c3.printCounters();

        int counter = Counter.countStatic;
        System.out.println(counter);
    }
}
