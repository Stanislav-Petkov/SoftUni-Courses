
class CommonElements02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr1 = scanner.nextLine().split(" ");
        String[] arr2 = scanner.nextLine().split(" ");
        for (int firstIndex = 0; firstIndex < arr2.length; firstIndex++) {
            String first = arr2[firstIndex];
            for (int secIndex = 0; secIndex < arr1.length; secIndex++) {
                String second = arr1[secIndex];
                if (first.equals(second)) {
                    System.out.print(first + " ");
                }
            }
        }
    }
}