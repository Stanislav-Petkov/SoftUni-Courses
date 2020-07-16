package viceCity.models.players;

public class MainPlayer extends BasePlayer {
    public static final String NAME = "Tommy Vercetti";
    private static final int LIFE_POINTS = 100;

    public MainPlayer() {
        super(NAME, LIFE_POINTS);
    }
}
