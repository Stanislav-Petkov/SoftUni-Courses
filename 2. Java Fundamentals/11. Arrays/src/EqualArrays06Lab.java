public class EqualArrays06Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] strList = line.split(" ");
        int arr1[] = new int[strList.length];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = Integer.parseInt(strList[i]);
        }
        String line2 = scanner.nextLine();
        String[] strList2 = line2.split(" ");
        int arr2[] = new int[strList2.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(strList2[i]);
        }
        int sum1 = 0;
        int sum2 = 0;
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum1 += arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            sum2 += arr2[j];
        }
        boolean isEqual = false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                index = i;
                isEqual = true;
                break;
            }
        }
        if ((sum1 == sum2) && !(isEqual)) {
            System.out.printf("Arrays are identical. Sum: %d%n", sum1);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.%n", index);
        }
    }
}
