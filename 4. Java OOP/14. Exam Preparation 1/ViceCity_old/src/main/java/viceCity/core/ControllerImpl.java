package viceCity.core;

import viceCity.common.ConstantMessages;
import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.GangNeighbourhood;
import viceCity.models.neighbourhood.Neighbourhood;
import viceCity.models.players.BasePlayer;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;
import viceCity.repositories.GunRepository;
import viceCity.repositories.interfaces.Repository;

import java.util.*;

public class ControllerImpl implements Controller {

    private List<Player> playerList; // v igrachite ima spisuk s orujiq
    private Deque<Gun> gunQueue = new ArrayDeque<>();
    //private Neighbourhood neighbourhood;

    public ControllerImpl() {
        playerList = new ArrayList<>();
        BasePlayer mainPlayer = new MainPlayer();
        playerList.add(mainPlayer);

    }

    @Override
    public String addPlayer(String name) {
        Player newCivilPlayer = new CivilPlayer(name); //Creates a civil player with the given name.
        boolean isNotContained = true;
        for (Player entry : playerList) {
            if(entry.getName().equals(name)){
                isNotContained = false;
            }
        }
        if(isNotContained) {
            playerList.add(newCivilPlayer);
        }
        return String.format(ConstantMessages.PLAYER_ADDED, name);
    }

    @Override
    public String addGun(String type, String name) {
        Gun newGun;
        if (type.equals("Pistol")) {
            newGun = new Pistol(name);
        } else if (type.equals("Rifle")) {
            newGun = new Rifle(name);
        } else {
            return ConstantMessages.GUN_TYPE_INVALID;
        }
        gunQueue.offer(newGun);
        return String.format(ConstantMessages.GUN_ADDED, name, type);
    }

    @Override
    public String addGunToPlayer(String playerName) {
        Player player;

        if (gunQueue.isEmpty()) {
            return ConstantMessages.GUN_QUEUE_IS_EMPTY;
        }
        if (playerName.equals("Vercetti")) {
            Gun gun = gunQueue.poll();

            for (Player entry : playerList) {
                if (entry.getName().equals("Tommy Vercetti")) {
                    Repository<Gun> curr = entry.getGunRepository();
                    curr.add(gun);
                }
            }
            return String.format(ConstantMessages.GUN_ADDED_TO_MAIN_PLAYER, gun.getName(), "Tommy Vercetti");
            //add gun to the main player repository
        } else {
            for (Player entry : playerList) {
                if (entry.getName().equals(playerName)) {
                    Gun gun = gunQueue.poll();
                    Repository<Gun> curr = entry.getGunRepository();
                    curr.add(gun);
                    return String.format(ConstantMessages.GUN_ADDED_TO_CIVIL_PLAYER, gun.getName(), playerName);
                }
            }
        }
        return ConstantMessages.CIVIL_PLAYER_DOES_NOT_EXIST;
    }

    @Override
    public String fight() {

        GangNeighbourhood gangNeighbourhood =new GangNeighbourhood();
        Player mainPlayer = null;
        List<Player> civil = new ArrayList<>();
        for (Player entry : playerList) {
            if(entry instanceof MainPlayer){
                mainPlayer = entry;
            }else{
                civil.add(entry);
            }
        }
        List<Player> civilCopy = List.copyOf(civil);


        gangNeighbourhood.action(mainPlayer,civil);
        List<Player> civilAfterAction = gangNeighbourhood.getCivil();

        if(mainPlayer.isAlive() && checkIfAllCivilPlayersAreAlive(civilAfterAction)){
            return ConstantMessages.FIGHT_HOT_HAPPENED;
        }

        if(checkIfAnyPlayerHasDifferentLifePoints(civilCopy, civilAfterAction)){

            return String.format(ConstantMessages.FIGHT_HAPPENED+"%n"+
                    ConstantMessages.MAIN_PLAYER_LIVE_POINTS_MESSAGE+"%n"+
                    ConstantMessages.MAIN_PLAYER_KILLED_CIVIL_PLAYERS_MESSAGE+"%n"+
                    ConstantMessages.CIVIL_PLAYERS_LEFT_MESSAGE,
                    mainPlayer.getLifePoints(),civilCopy.size() - civilAfterAction.size(), civilAfterAction.size());
        }
        return null;//TODO
    }

    private boolean checkIfAnyPlayerHasDifferentLifePoints(List<Player> civilOldCopy,List<Player>civilAfterAction ) {
        if(civilAfterAction.equals(civilOldCopy)){
            return false;
        }
        return true;
    }

    private boolean checkIfAllCivilPlayersAreAlive(List<Player> civilAfterAction){
        if(civilAfterAction.size() == 0){
            return false;
        }
        for (Player player : civilAfterAction) {
            if(!player.isAlive()){
                return false;
            }
        }
        return true;
    }
}
