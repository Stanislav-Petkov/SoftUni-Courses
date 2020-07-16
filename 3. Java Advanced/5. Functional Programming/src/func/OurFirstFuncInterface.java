package func;

@FunctionalInterface
public interface OurFirstFuncInterface {

    int f(int x);
    default void test(){//moje da ima default metod koito e implementiran v  @FunctionalInterfac
        System.out.println("Testing");
    }
}
