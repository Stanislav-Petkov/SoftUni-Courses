package footballTeamGenerator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<String, Map<Team, List<Player>>> teams = new HashMap<>();
        while (!line.equals("END")) {
            String[] tokens = line.split(";");
            String command = tokens[0];
            switch (command) {
                case "Team": {
                    String teamName = tokens[1];
                    Team team = new Team(teamName);
                    List<Player> list = new ArrayList<>();
                    Map<Team, List<Player>> newMap = new HashMap<>();
                    newMap.putIfAbsent(team, list);
                    teams.putIfAbsent(teamName, newMap);
                    break;
                }
                case "Add": {
                    String teamName = tokens[1];
                    String playerName = tokens[2];
                    int endurance = Integer.parseInt(tokens[3]);
                    int sprint = Integer.parseInt(tokens[4]);
                    int dribble = Integer.parseInt(tokens[5]);
                    int passing = Integer.parseInt(tokens[6]);
                    int shooting = Integer.parseInt(tokens[7]);

                    Player player = null;
                    try {
                        player = new Player(playerName, endurance, sprint, dribble, passing, shooting);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }

                    if (player != null) {
                        boolean wasAdded = false;
                        Map<Team, List<Player>> teamListMap = teams.get(teamName);
                        if (teamListMap != null) {
                            for (Map.Entry<Team, List<Player>> map : teamListMap.entrySet()) {
                                if (map.getKey().getName().equals(teamName)) {
                                    map.getKey().addPlayer(player);
                                    wasAdded = true;
                                    break;
                                }
                            }
                        }
                        try {
                            if (!wasAdded) {
                                throw new IllegalArgumentException("Team " + teamName + " does not exist.");
                            }
                        } catch (IllegalArgumentException e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    break;
                }
                case "Remove": {
                    String teamName = tokens[1];
                    String playerName = tokens[2];

                    Map<Team, List<Player>> teamListMap = teams.get(teamName);
                    for (Map.Entry<Team, List<Player>> map : teamListMap.entrySet()) {
                        if (map.getKey().getName().equals(teamName)) {
                            try {
                                map.getKey().removePlayer(playerName);
                            } catch (IllegalArgumentException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }
                    }
                    break;
                }
                case "Rating": {
                    String teamName = tokens[1];
                    Map<Team, List<Player>> curr = teams.get(teamName);
                    if (curr == null) {
                        System.out.printf("Team " + teamName + " does not exist.%n");
                        return;
                    }
                    for (Map.Entry<Team, List<Player>> map : curr.entrySet()) {
                        System.out.println(map.getKey().getName() + " - " + String.format("%.0f", map.getKey().getRating()));
                    }
                    break;
                }
            }
            line = scanner.nextLine();
        }
    }
}
