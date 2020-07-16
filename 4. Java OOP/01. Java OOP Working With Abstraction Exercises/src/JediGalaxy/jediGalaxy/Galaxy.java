package JediGalaxy.jediGalaxy;


public class Galaxy {
    private Filed filed;

    private Movement first; //jediMovement
    private Movement second;//sithMOvement

    public Galaxy(Filed filed, Movement first, Movement second) {
        this.filed = filed;
        this.first = first;
        this.second = second;
    }

    public void moveSith(int row, int col) {
        this.second.move(row, col, this.filed);
    }

    public long moveJedi(int row, int col) {
        return this.first.move(row, col, this.filed);
    }
}
