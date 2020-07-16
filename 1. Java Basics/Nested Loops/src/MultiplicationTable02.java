public class MultiplicationTable02 {
    public static void main(String[] args) {
        boolean flag = false;
        for (int first = 1; first < 11; first++) {
            for (int second = 1; second < 11; second++) {
                int result = first * second;
                System.out.printf("%d * %d = %d %n", first, second, result);
                if (second == 3) {
                    flag = true;
                    break;
                }
            }

        }
    }
}
