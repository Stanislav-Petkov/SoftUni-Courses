package militaryElite6;


import militaryElite6.entities.*;
import militaryElite6.enumerations.Corps;
import militaryElite6.interfaces.*;

public class Main {
    private static Map<Integer, Private> soldierByIds = new LinkedHashMap<>();
    private static Map<Integer, Spy> spyMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!input.equals("End")) {
            Private soldier = createSoldier(input);
            if (soldier != null) {
                soldierByIds.put(soldier.getId(), soldier);
            }
            input = scanner.nextLine();
        }
        //PRINTING
        for (Soldier value : soldierByIds.values()) {
            System.out.println(value.toString());
            if (value instanceof CommandoImpl) {
                Collection<Mission> mi = ((CommandoImpl) value).getMissions();
                System.out.printf("");
                for (int i = 0; i < mi.size(); i++) {
                    mi.ge
                }
            }
        }
    }

    private static Private createSoldier(String input) {
        String[] tokens = input.split("\\s+");
        String type = tokens[0];
        Private aPrivate;
        switch (type) {
            case "Private":
                aPrivate = new PrivateImpl(
                        Integer.parseInt(tokens[1]),
                        tokens[2],
                        tokens[3],
                        Double.parseDouble(tokens[4]));
                break;
            case "LeutenantGeneral":
                aPrivate = createLieutenantGeneral(tokens);
                break;
            case "Engineer":
                aPrivate = createEngineer(tokens);
                break;
            case "Commando":
                aPrivate = createCommando(tokens);
                break;
            case "Spy":
                spyMap.put(Integer.parseInt(tokens[1]), new SpyImpl(Integer.parseInt(tokens[1]),
                        tokens[2],
                        tokens[3],
                        tokens[4]));
            default:
                aPrivate = null;

        }
        return aPrivate;
    }

    private static Private createCommando(String[] tokens) {
        String cops = tokens[5];
        if (cops.equals("Airforces") || cops.equals("Marines")) {
            Commando commando = new CommandoImpl(Integer.parseInt(tokens[1]),
                    tokens[2],
                    tokens[3],
                    Double.parseDouble(tokens[4]),
                    Corps.valueOf(cops.toUpperCase()));
            for (int i = 6; i < tokens.length; i += 2) {
                String codeName = tokens[i];
                String state = tokens[i + 1];

                if (!state.equals("inProgress") && !state.equals("finished")) {
                    continue;
                }

                Mission mission = new MissionImpl(codeName,
                        state.equals("inProgress") ? MissionImpl.Status.IN_PROGRESS
                                : MissionImpl.Status.FINISHED);
                commando.addMission(mission);
            }
            return commando;
        }
        return null;
    }

    private static Private createEngineer(String[] tokens) {
        String cops = tokens[5];
        if (cops.equals("Airforces") || cops.equals("Marines")) {
            Engineer engineer = new EngineerImpl(Integer.parseInt(tokens[1]),
                    tokens[2],
                    tokens[3],
                    Double.parseDouble(tokens[4]),
                    Corps.valueOf(cops.toUpperCase()));
            for (int i = 6; i < tokens.length; i += 2) {
                String partName = tokens[i];
                int hoursWorked = Integer.parseInt(tokens[i + 1]);
                Repair repair = new RepairImpl(partName, hoursWorked);
                engineer.addRepair(repair);
            }
            return engineer;
        }
        return null;
    }

    private static Private createLieutenantGeneral(String[] tokens) {
        LieutenantGeneral lieutenantGeneral = new LieutenantGeneralImpl(Integer.parseInt(tokens[1]),
                tokens[2],
                tokens[3],
                Double.parseDouble(tokens[4]));
        for (int i = 5; i < tokens.length; i++) {
            lieutenantGeneral.addPrivate(soldierByIds.get(Integer.parseInt(tokens[i])));
        }
        return lieutenantGeneral;
    }
}













