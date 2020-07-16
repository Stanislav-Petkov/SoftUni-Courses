package foodShortage4;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Buyer> buyersByName = new HashMap<>();
        while (n-- > 0) {
            Buyer buyer = createPerson(scanner.nextLine());
            buyersByName.put(buyer.getName(), buyer);
        }
        String line = scanner.nextLine();
        while (!line.equals("End")) {
            Buyer buyer = buyersByName.get(line);
            if (buyer != null) {
                buyer.buyFood();
            }
            line = scanner.nextLine();
        }
        System.out.println(buyersByName.values().stream()
                .mapToInt(Buyer::getFood)
                .sum());
    }

    private static Buyer createPerson(String input) {
        String[] tokens = input.split("\\s+");
        if (tokens.length == 4) {
            return new Citizen(tokens[0], Integer.parseInt(tokens[1]),
                    tokens[2], tokens[3]);
        }
        return new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }
}
