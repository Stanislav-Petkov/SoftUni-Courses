public class SmallestofThreeNumbers01Lab {
    static int findSmallestOfThree(int a, int b, int c) {
        return findSmallest(findSmallest(a, b), c);
    }

    static int findSmallest(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.print(findSmallestOfThree(a, b, c));
    }
}