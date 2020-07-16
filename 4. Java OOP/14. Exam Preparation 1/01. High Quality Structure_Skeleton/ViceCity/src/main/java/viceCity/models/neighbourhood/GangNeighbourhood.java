package viceCity.models.neighbourhood;

import viceCity.models.guns.Gun;
import viceCity.models.players.Player;

import java.util.Collection;

public class GangNeighbourhood implements Neighbourhood {
    @Override
    public void action(Player mainPlayer, Collection<Player> civilPlayers) {
        for (Gun gun : mainPlayer.getGunRepository().getModels()) {
            while (gun.canFire()) {
                int fire = gun.fire();
                for (Player civilPlayer : civilPlayers) {
                    if (civilPlayer.isAlive()) {
                        civilPlayer.takeLifePoints(fire);
                        break;
                    }
                }
            }
        }

        for (Player civilPlayer : civilPlayers) {
            for (Gun gun : civilPlayer.getGunRepository().getModels()) {
                while (gun.canFire()) {
                    int fire = gun.fire();
                    if (mainPlayer.isAlive()) {
                        mainPlayer.takeLifePoints(fire);
                    } else {
                        return;
                    }
                }
            }
        }
    }
}

