public class ChangeList02Ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagonList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 5, 5, 6));
        while (true) {
            String[] input = scanner.nextLine().split(" ");
            if (input[0].contains("end")) {
                break;
            }
            if (input[0].contains("Delete")) {
                for (int i = 0; i < wagonList.size() * 2; i++) {
                    if (wagonList.get(i).equals(Integer.parseInt(input[1]))) {
                        wagonList.remove(Integer.parseInt(input[1]));
                    }
                }
            } else if (input[0].contains("Insert")) {
                wagonList.add(Integer.parseInt(input[2]), Integer.parseInt(input[1]));
            }
        }
        for (int i = 0; i < wagonList.size(); i++) {
            System.out.print(wagonList.get(i) + " ");
        }
    }
}
