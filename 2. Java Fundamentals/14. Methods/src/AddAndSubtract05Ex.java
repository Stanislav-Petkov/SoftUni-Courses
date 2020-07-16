public class AddAndSubtract05Ex {
    static int getSum(int first, int second, int third) {
        int sum = 0;
        sum = first + second;
        return getSubtract(sum, third);
    }

    static int getSubtract(int sumResult, int third) {
        return sumResult - third;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        System.out.println(getSum(first, second, third));
    }
}
