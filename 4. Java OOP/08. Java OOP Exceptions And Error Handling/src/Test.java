public class Test {
    public static void main(String[] args) {
        try {
            sqrt(-1);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error" + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static double sqrt(double value) {
        if (value < 0) {
            throw new IllegalArgumentException(
                    "Sqrt for negative is undefined");
        }
        return Math.sqrt(value);
    }
}