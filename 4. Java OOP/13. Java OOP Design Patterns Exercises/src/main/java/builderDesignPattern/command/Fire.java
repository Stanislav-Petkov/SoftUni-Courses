package builderDesignPattern.command;

import builderDesignPattern.core.Main;

public class Fire implements Command {
    @Override
    public void execute() {
        Main.player.throwStone();
    }
}
