public class SoftUniParty02Lab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Set<String> reservationCode = new TreeSet<>();
        while (!line.equals("PARTY")) {
            reservationCode.add(line);
            line = scanner.nextLine();
        }

        while (!line.equals("END")) {
            reservationCode.remove(line);
            line = scanner.nextLine();
        }
        System.out.println(reservationCode.size());
        for (String guest : reservationCode) {
            System.out.println(guest);
        }
    }
}
