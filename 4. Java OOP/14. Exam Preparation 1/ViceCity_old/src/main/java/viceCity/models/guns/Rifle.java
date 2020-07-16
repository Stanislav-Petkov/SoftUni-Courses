package viceCity.models.guns;

public class Rifle extends BaseGun {
    public Rifle(String name) {
        super(name,50,500);
    }
    @Override
    public int fire(){
        if(this.getBulletsPerBarrel()==0){
            if(this.getTotalBullets()>= this.getCapacityOfBarrel()) {
                this.reload();
            }
        }
        this.changeBulletsAfterFire(5);
        return 5;
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
