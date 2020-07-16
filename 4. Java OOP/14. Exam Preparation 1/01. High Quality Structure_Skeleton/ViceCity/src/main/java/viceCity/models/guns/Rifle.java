package viceCity.models.guns;

public class Rifle extends BaseGun {
    private static final int BULLETS_PER_BARREL = 50;
    private static final int TOTAL_BULLETS = 500;

    public Rifle(String name) {
        super(name, BULLETS_PER_BARREL, TOTAL_BULLETS);
    }

    @Override
    public int fire() {
        if (canFire() && this.getBulletsPerBarrel() == 0) {
            this.reload();
        }
        decreaseBullets(5);
        //if it can fire return 5
        return canFire() ? 5 : 0;
    }
}
