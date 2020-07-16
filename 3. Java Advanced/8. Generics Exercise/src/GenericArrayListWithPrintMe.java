import java.util.ArrayList;

public class GenericArrayListWithPrintMe<T> extends ArrayList<T> {
    public void printMe() {
        System.out.println(this.toString());
    }
}
