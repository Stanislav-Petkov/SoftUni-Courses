package FirstAndReserve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());

        Team players = new Team("Black Eagles");
        for (int i = 0; i < n; i++) {
            String line = reader.readLine();
            try {
                players.addPlayer(PersonParser.from(line));
            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }
        //players = Collections.unmodifiableList(players);
        System.out.println("First team have " +
                players.getFirstTeam().size() + " players");
        System.out.println("Reserve team have " +
                players.getReserveTeam().size() + " players");
    }
}
