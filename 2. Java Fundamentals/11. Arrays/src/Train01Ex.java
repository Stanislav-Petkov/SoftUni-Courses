
class Train01Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = Integer.parseInt(scanner.nextLine());
            sum += num[i];
        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}