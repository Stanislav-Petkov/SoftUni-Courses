package viceCity.models.guns;

public class Pistol extends BaseGun {
    private static final int BULLETS_PER_BARREL = 10;
    private static final int TOTAL_BULLETS = 100;

    public Pistol(String name) {
        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        if (canFire() && this.getBulletsPerBarrel() == 0) {
            this.reload();
        }
        decreaseBullets(1);
        //if it can fire return 1
        return canFire() ? 1 : 0;
    }
}
