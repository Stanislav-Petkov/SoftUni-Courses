package viceCity.models.guns;

import viceCity.common.ExceptionMessages;

public abstract class BaseGun implements Gun {
    private String name;
    private int bulletsPerBarrel;
    private int totalBullets;
    private int capacityOfBarrel;

    public BaseGun(String name, int bulletsPerBarrel, int totalBullets){
        this.name = name;
        this.bulletsPerBarrel = bulletsPerBarrel;
        this.totalBullets = totalBullets;
        this.capacityOfBarrel = bulletsPerBarrel;
    }

    @Override
    public String getName() {
        if (this.name == null || this.name.isEmpty()) {
            throw new NullPointerException(ExceptionMessages.NAME_NULL);
        }else {
            return this.name;
        }
    }

    @Override
    public int getBulletsPerBarrel() {
        if(this.bulletsPerBarrel < 0){
            throw new IllegalArgumentException(ExceptionMessages.BULLETS_LESS_THAN_ZERO);
        }else {
            return this.bulletsPerBarrel;
        }
    }

    @Override
    public boolean canFire() {
        return false;
    }

    public int getCapacityOfBarrel(){
        return this.capacityOfBarrel;
    }

    public void reload(){
        this.bulletsPerBarrel += this.capacityOfBarrel;
        this.totalBullets -= this.capacityOfBarrel;
    }

    @Override
    public int getTotalBullets() {
        if(this.totalBullets < 0){
            throw new IllegalArgumentException(ExceptionMessages.TOTAL_BULLETS_LESS_THAN_ZERO);
        }else {
            return this.totalBullets;
        }
    }

    @Override
    public int fire() {
        return 0;
    }

    public void changeBulletsAfterFire(int bulletsToDecreaseWith){

        this.bulletsPerBarrel = this.bulletsPerBarrel - bulletsToDecreaseWith;
    }
}
