package commandDesignPattern.command;

import commandDesignPattern.core.Main;
import static commandDesignPattern.core.Main.player;

public class MoveDown implements Command {
    @Override
    public void execute() {
        player.increaseRow();
    }
}
