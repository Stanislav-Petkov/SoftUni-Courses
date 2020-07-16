
//20/100
class EqualSums06Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        int curSum1 = 0;
        int curSum2 = 0;
        int special = 0;
        boolean isFound = false;
        for (int i = 0; i < numbers.length; i++) {
            curSum1 += numbers[i];
            for (int j = i + 2; j < numbers.length; j++) {

                curSum2 += numbers[j];
                if (curSum1 < curSum2) {
                    curSum2 = 0;
                    break;
                }
                if (curSum1 == curSum2) {
                    special = i + 1;
                    isFound = true;
                    break;
                }
            }
        }
        if (isFound) {
            System.out.print(special);
        } else if (numbers.length == 1) {
            System.out.println(0);
        } else {
            System.out.print("no");
        }
    }
}