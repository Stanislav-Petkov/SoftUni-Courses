package footballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name,
                  int endurance,
                  int sprint,
                  int dribble,
                  int passing,
                  int shooting) {
        this.setName(name);
        this.setEndurance(endurance);
        this.setSprint(sprint);
        this.setDribble(dribble);
        this.setPassing(passing);
        this.setShooting(shooting);
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

    private void setSprint(int sprint) {
        validateStatistic(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        validateStatistic(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        validateStatistic(passing, "Passing");
        this.passing = passing;

    }

    private void setShooting(int shooting) {
        validateStatistic(shooting, "Shooting");
        this.shooting = shooting;
    }

    private void setEndurance(int endurance) {
        validateStatistic(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void validateStatistic(int stat, String statName) {
        if (stat < 0 || stat > 100) {
            throw new IllegalArgumentException(statName + " should be between 0 and 100.");
        }
    }

    public double overallSkillLevel() {
        return (this.endurance +
                this.sprint +
                this.dribble +
                this.passing +
                this.shooting) / 5.0;
    }
}
