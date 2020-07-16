package viceCity.core;

import viceCity.common.ConstantMessages;
import viceCity.core.interfaces.Controller;
import viceCity.models.guns.Gun;
import viceCity.models.guns.Pistol;
import viceCity.models.guns.Rifle;
import viceCity.models.neighbourhood.GangNeighbourhood;
import viceCity.models.neighbourhood.Neighbourhood;
import viceCity.models.players.CivilPlayer;
import viceCity.models.players.MainPlayer;
import viceCity.models.players.Player;

import static viceCity.common.ConstantMessages.*;

public class ControllerImpl implements Controller {

    private Map<String, Player> players;
    private Deque<Gun> guns;
    private Neighbourhood neighbourhood;

    public ControllerImpl() {
        this.players = new LinkedHashMap<>();
        Player mainPlayer = new MainPlayer();
        this.players.put(mainPlayer.getName(), mainPlayer);
        this.guns = new ArrayDeque<>();
        this.neighbourhood = new GangNeighbourhood();
    }

    @Override
    public String addPlayer(String name) {
        Player player = new CivilPlayer(name);
        this.players.putIfAbsent(player.getName(), player);
        return String.format(ConstantMessages.PLAYER_ADDED, name);
    }

    @Override
    public String addGun(String type, String name) {
        String message = ConstantMessages.GUN_TYPE_INVALID;
        if (type.equals("Pistol")) {
            this.guns.offer(new Pistol(name));
            message = String.format(ConstantMessages.GUN_ADDED, name, type);
        } else if (type.equals("Rifle")) {
            this.guns.offer(new Rifle(name));
            message = String.format(ConstantMessages.GUN_ADDED, name, type);
        }
        return message;
    }

    @Override
    public String addGunToPlayer(String name) {
        Gun gun = this.guns.peek();
        String response = "";
        if (gun == null) {
            response = ConstantMessages.GUN_QUEUE_IS_EMPTY;
        } else if (name.equals("Vercetti")) {
            this.players.get(MainPlayer.NAME).getGunRepository().add(gun);
            this.guns.poll();
            response =
                    String.format(ConstantMessages.GUN_ADDED_TO_MAIN_PLAYER,
                            gun.getName(), MainPlayer.NAME);

        } else {
            Player player = this.players.get(name);
            if (player == null) {
                response = ConstantMessages.CIVIL_PLAYER_DOES_NOT_EXIST;
            } else {
                player.getGunRepository().add(gun);
                response = String.format(ConstantMessages.GUN_ADDED_TO_CIVIL_PLAYER,
                        gun.getName(), player.getName());
                this.guns.pop();
            }
        }
        return response;
    }

    @Override
    public String fight() {
        Player player = this.players.remove(MainPlayer.NAME);
        this.neighbourhood.action(player, this.players.values());

        this.players.put(player.getName(), player);

        boolean allAreFine = player.getLifePoints() == 100;

        if (allAreFine) {
            for (Player player1 : players.values()) {
                if (player1.getLifePoints() < 50) {
                    allAreFine = false;
                    break;
                }
            }
        }

        if (allAreFine) {
            return ConstantMessages.FIGHT_HOT_HAPPENED;
        } else {
            long playersSlain = players.values()
                    .stream()
                    .filter(p -> !p.isAlive())
                    .count();
            if (!player.isAlive()) {
                playersSlain--;
            }
            StringBuilder builder = new StringBuilder(FIGHT_HAPPENED);
            builder.append(System.lineSeparator())
                    .append(String.format(MAIN_PLAYER_LIVE_POINTS_MESSAGE, player.getLifePoints()))
                    .append(System.lineSeparator())
                    .append(String.format(MAIN_PLAYER_KILLED_CIVIL_PLAYERS_MESSAGE, playersSlain))
                    .append(System.lineSeparator())
                    .append(String.format(CIVIL_PLAYERS_LEFT_MESSAGE, players.size() - playersSlain - 1))
                    .append(System.lineSeparator());
            return builder.toString();
        }
    }
}
