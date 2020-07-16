package demoStatic;

public class OtherClass {
    static String outerField;

    static {
        System.out.println(outerField);
        outerField = "asd";
    }

    static class InnerClass {
        String innerField = "inner";
    }

    public static void main(String[] args) {
        System.out.println("kkkl");
        InnerClass innerClass = new InnerClass();
        System.out.println(outerField);
    }
}
