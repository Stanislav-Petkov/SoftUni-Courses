package footballTeamGenerator;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team(String name) {
        this.setName(name);
        this.players = new ArrayList<>();
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name.trim();
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(String playerName) {
        int index = -1;
        for (int i = 0; i < this.players.size(); i++) {
            if (this.players.get(i).getName().equals(playerName)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            this.players.remove(index);
        } else {
            throw new IllegalArgumentException("Player " + playerName + " is not in " + this.name + " team.");
        }
    }

    public double getRating() {
        return this.players.stream()
                .mapToDouble(Player::overallSkillLevel)
                .average()
                .orElse(0);
    }
}
