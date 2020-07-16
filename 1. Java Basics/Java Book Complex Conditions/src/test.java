import java.math.BigDecimal;
import java.math.RoundingMode;

public class test {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(1.555d);
        System.out.println("bd=" + bd);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        System.out.println("after rounding bd=" + bd);
        double d = bd.doubleValue();
        System.out.println("after rounding d=" + d);
    }
}
