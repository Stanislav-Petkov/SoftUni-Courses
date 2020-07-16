package viceCity.models.guns;

public class Pistol extends BaseGun {
    public Pistol(String name) {
        super(name,10,100 );
    }
    @Override
    public int fire() {
        if(this.getBulletsPerBarrel()==0){
            if(this.getTotalBullets()>= this.getCapacityOfBarrel()) {
                this.reload();
            }
        }
        this.changeBulletsAfterFire(1);
        return 1;
    }

    @Override
    public boolean canFire(){
        if(this.getTotalBullets() > 0 || this.getBulletsPerBarrel() > 0){
            return true;
        }else {
            return false;
        }
    }

}
