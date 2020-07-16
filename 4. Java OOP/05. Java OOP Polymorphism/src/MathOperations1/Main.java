package MathOperations1;

public class Main {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();
        MathOp2 mathOp2 = new MathOp2();
        System.out.println(math.add(2, 2));
        System.out.println(math.add(3, 3, 3));
        System.out.println(math.add(4, 4, 4, 4));
        System.out.println(mathOp2.add(2, 3));
    }
}
