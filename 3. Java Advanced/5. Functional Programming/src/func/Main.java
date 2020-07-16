package func;

public class Main {
    public static void main(String[] args) {

        OurFirstFuncInterface lambda = (x) -> x * 5;
        IAcceptLambda((x) -> {
            x = x + 1;
            x = x + 1;
            x = x + 1;
            x = x + 1;
            return x + 1;
        });
    }

    public static void IAcceptLambda(OurFirstFuncInterface lambda) {
        System.out.println(lambda.f(5));
    }
}
