public class CondenseArraytoNumber07Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int nums[] = new int[input.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            int condensed[] = new int[nums.length - 1];
            for (int p = 0; p < condensed.length; p++) {
                condensed[p] = nums[p] + nums[p + 1];
            } //  5 0 4 1 2   2 10 3
            for (int j = 0; j < condensed.length; j++) {
                nums[j] = condensed[j];
            }
        }
        System.out.println(nums[0]);
    }
}
