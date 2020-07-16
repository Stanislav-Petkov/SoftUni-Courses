public class CountRealNumbersLab01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] doubles = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> strings = new TreeMap<>();
        for (Double numbers : doubles) {
            if (!strings.containsKey(numbers)) {
                strings.put(numbers, 0);
            }
            strings.put(numbers, strings.get(numbers) + 1);
            Integer nn = strings.get(numbers);
            System.out.println(nn);
        }
        System.out.println(strings.entrySet());
    }
}
