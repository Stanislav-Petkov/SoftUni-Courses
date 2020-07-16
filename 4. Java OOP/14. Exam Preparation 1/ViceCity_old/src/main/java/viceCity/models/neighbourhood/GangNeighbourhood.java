package viceCity.models.neighbourhood;

import viceCity.models.guns.Gun;
import viceCity.models.players.Player;
import viceCity.repositories.interfaces.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GangNeighbourhood implements Neighbourhood {
    private Player mainPlayer;
    private List<Player> civil;

    public GangNeighbourhood() {
        civil = new ArrayList<>();
    }

    public List<Player> getCivil() {
        return this.civil;
    }

    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {
//todo
        this.mainPlayer = mainPlayer;
        this.civil = (List<Player>) civilPlayers;
        List<Player> civilPlayersCopy = new ArrayList<>(List.copyOf(civilPlayers));

        //starts decreasing each gun's bullets
        //starts decreasing the first civil player health points;

        //MAIN PLAYER SHOOTS AT CIVILS
        Repository<Gun> gunRepository = mainPlayer.getGunRepository();
        Collection<Gun> models = gunRepository.getModels();
        for (Gun gun : models) {

            for (Player civilPlayer : civilPlayers) { //iterira po originalniq spisuk i maha ot kopieto, nakraq da kopira copieto v originala
                if (gun.getTotalBullets() == 0 && gun.getBulletsPerBarrel() == 0) {
                    break;
                }
                if (gun.canFire()) {
                    while (civilPlayer.isAlive()) {
                        if (gun.getTotalBullets() == 0 && gun.getBulletsPerBarrel() == 0) {
                            break;
                        }
                        int bulletsToDecreaseCivilLife = gun.fire();
                        civilPlayer.takeLifePoints(bulletsToDecreaseCivilLife);
                        if (!civilPlayer.isAlive()) {
                            civilPlayersCopy.remove(civilPlayer);
                        }
                    }
                }
                if (gun.getTotalBullets() == 0 && gun.getBulletsPerBarrel() == 0) {
                    break;
                }
            }
            if (civilPlayersCopy.size() == 0) {
                break;
            }
        }
        this.civil = civilPlayersCopy;

        //CIVILS start SHOOTing AT MAIN PLAYER
        List<Player> civilAttackers = this.civil;
        for (Player civilAttacker : civilAttackers) {
            Repository<Gun> civilGunRepo = civilAttacker.getGunRepository();
            Collection<Gun> guns = civilGunRepo.getModels();
            for (Gun gun : guns) {
                while (gun.canFire()){
                    int bullet = gun.fire();
                    mainPlayer.takeLifePoints(bullet);
                    if(!mainPlayer.isAlive()){
                        return;
                    }
                }
            }
        }
        this.civil = civilAttackers;
    }
}
