public class RemoveNegativesandReverseLab07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> unsorted = new ArrayList<>();
        String[] parts = scanner.nextLine().split(" ");
        for (int i = 0; i < parts.length; i++) {
            unsorted.add(Integer.parseInt(parts[i]));
        }
        unsorted.removeIf(n -> n < 0);
        Collections.reverse(unsorted);
        if (unsorted.isEmpty()) {
            System.out.println("empty");
        } else {
            System.out.println(unsorted.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}

