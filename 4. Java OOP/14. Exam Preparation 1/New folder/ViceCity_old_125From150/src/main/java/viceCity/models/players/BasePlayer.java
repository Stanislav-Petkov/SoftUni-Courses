package viceCity.models.players;

import viceCity.common.ExceptionMessages;
import viceCity.models.guns.Gun;
import viceCity.repositories.GunRepository;
import viceCity.repositories.interfaces.Repository;


public abstract class BasePlayer implements Player {
    private String name;
    private int lifePoints;
    Repository<Gun> gunRepository;

    // public BasePlayer(){}
    public BasePlayer(String name, int lifePoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.gunRepository = new GunRepository();
    }

    @Override
    public String getName() {
        if (this.name == null || this.name.isEmpty()) {
            throw new NullPointerException(ExceptionMessages.PLAYER_NULL_USERNAME);
        } else {
            return this.name;
        }

    }

    @Override
    public int getLifePoints() {
        if (this.lifePoints < 0) {
            throw new IllegalArgumentException(ExceptionMessages.PLAYER_LIFE_POINTS_LESS_THAN_ZERO);
        } else {
            return this.lifePoints;
        }

    }

    @Override
    public boolean isAlive() {

        //return false;
        if (this.lifePoints > 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Repository<Gun> getGunRepository() {
        return this.gunRepository;
    }

    @Override
    public void takeLifePoints(int points) {
        int currentPoints = this.lifePoints;
        if (currentPoints - points >= 0) {
            this.lifePoints = currentPoints - points;
        } else if (currentPoints - points < 0) {
            this.lifePoints = 0;
        }
    }
}
