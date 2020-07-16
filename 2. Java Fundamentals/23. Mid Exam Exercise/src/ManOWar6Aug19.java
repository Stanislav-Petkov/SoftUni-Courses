
import java.util.stream.Collectors;

public class ManOWar6Aug19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> pirateShip = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\>")));
        List<Integer> pirateList = pirateShip.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        List<String> warShip = new ArrayList<>(Arrays.asList(scanner.nextLine().split("\\>")));
        List<Integer> warList = warShip.stream()
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        int maxHealth = Integer.parseInt(scanner.nextLine());
        String commands = scanner.nextLine();
        boolean isStalementFromDefend = false;
        boolean isStalementFromFire = false;
        while (!commands.equals("Retire")) {
            List<String> commandParts = Arrays.asList(commands.split(" "));
            String actionType = commandParts.get(0);
            switch (actionType) {
                case "Fire":
                    int indexCheck = Integer.parseInt(commandParts.get(1));
                    int damage = Integer.parseInt(commandParts.get(2));
                    isStalementFromFire = fire(indexCheck, damage, isStalementFromFire, warList);
                    break;
                case "Defend":
                    int startIndex = Integer.parseInt(commandParts.get(1));
                    int endIndex = Integer.parseInt(commandParts.get(2));
                    int damageValue = Integer.parseInt(commandParts.get(3));
                    isStalementFromDefend = defend(startIndex, endIndex, damageValue, isStalementFromDefend, pirateList);
                    break;
                case "Repair":
                    int indexForRepair = Integer.parseInt(commandParts.get(1));
                    int health = Integer.parseInt(commandParts.get(2));
                    repair(indexForRepair, health, maxHealth, pirateList);
                    break;
                case "Status":
                    status(maxHealth, pirateList);
                    break;
                default:
                    throw new IllegalStateException("Unknown type: " + actionType);
            }
            commands = scanner.nextLine();
        }
        int pirateShipSum = 0;
        int warShipSum = 0;
        for (int i = 0; i < pirateList.size(); i++) {
            pirateShipSum += pirateList.get(i);
        }
        for (int i = 0; i < warList.size(); i++) {
            warShipSum += warList.get(i);
        }
        boolean isStale = true;
        if (isStalementFromFire) {
            System.out.println("You won! The enemy ship has sunken.");
        } else if (isStalementFromDefend) {
            System.out.println("You lost! The pirate ship has sunken.");
        } else {
            System.out.printf("Pirate ship status: %d%n", pirateShipSum);
            System.out.printf("Warship status: %d%n", warShipSum);
        }
    }

    private static boolean defend(int startIndex, int endIndex, int damageValue, boolean isStalementFromDefend, List<Integer> pirateList) {
        if ((isIndexValid(startIndex, pirateList)) && (isIndexValid(endIndex, pirateList))) {
            for (int i = startIndex; i <= endIndex; i++) {
                pirateList.set(i, pirateList.get(i) - damageValue);
                if (pirateList.get(i) <= 0) {
                    isStalementFromDefend = true;
                    break;
                }
            }
        }
        return isStalementFromDefend;
    }

    private static boolean fire(int indexCheck, int damage, boolean isStalementFromFire, List<Integer> warList) {
        if (isIndexValid(indexCheck, warList)) {
            warList.set(indexCheck, warList.get(indexCheck) - damage);
            int sectionBreaksCheck = warList.get(indexCheck);
            if (sectionBreaksCheck <= 0) {
                isStalementFromFire = true;
            }
        }
        return isStalementFromFire;
    }

    private static boolean isIndexValid(int indexCheck, List<Integer> warList) {
        return indexCheck >= 0 && indexCheck < warList.size();
    }

    private static void repair(int indexForRepair, int health, int maxHealth, List<Integer> pirateList) {
        if (isIndexValid(indexForRepair, pirateList)) {
            pirateList.set(indexForRepair, pirateList.get(indexForRepair) + health);
            if (pirateList.get(indexForRepair) > maxHealth) {
                pirateList.set(indexForRepair, maxHealth);
            }
        }
    }

    private static void status(int maxHealth, List<Integer> pirateList) {
        int counter = 0;
        for (int i = 0; i < pirateList.size(); i++) {
            if (pirateList.get(i) < 0.2 * maxHealth) {
                counter++;
            }
        }
        System.out.printf("%d sections need repair.%n", counter);
    }
}




