package commandDesignPattern.command;

import commandDesignPattern.core.Main;

public class Fire implements Command {
    @Override
    public void execute() {
        Main.player.throwStone();
    }
}
