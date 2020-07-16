package test;

public class Test extends ParentTest implements TestInterface {
    private String s;

    public Test() {
        s = "TestClassName";
    }

    public void method1() {
        System.out.println("The string is " + s);
    }

    private void method2(int n) {
        System.out.println("The number is " + n);
    }

    private void method3() {
        System.out.println("THe private method");
    }
}









