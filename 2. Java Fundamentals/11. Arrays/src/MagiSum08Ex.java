
class MagiSum08Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int first = nums[i];
            for (int j = i + 1; j < arr.length; j++) {
                int second = nums[j];
                if (first + second == n) {
                    System.out.println(first + " " + second);
                }
            }
        }
    }
}