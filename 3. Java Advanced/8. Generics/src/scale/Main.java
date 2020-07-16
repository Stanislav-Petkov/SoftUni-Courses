package scale;

public class Main {
    public static void main(String[] args) {
        Scale<Integer> scale = new Scale<>(5,10);

        String a = "alice";
        String b = "bob";
        System.out.println(a.compareTo(b));
        System.out.println(scale.getHeavier());
    }
}
